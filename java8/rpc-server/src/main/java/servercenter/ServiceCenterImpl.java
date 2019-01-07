import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 服务中心服务类
 * @author xinjian.ye
 * @date 2019/1/7
 */
public class ServiceCenterImpl implements IServerCenter {

    private static ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private static Map<String, Class> registryMap = new HashMap<String, Class>();

    private static boolean running = false;

    private int port;

    public ServiceCenterImpl() {
    }

    public ServiceCenterImpl(int port) {
        this.port = port;
    }

    @Override
    public void stop() {
        running = false;
        executor.shutdown();
    }

    @Override
    public void start() throws IOException {
        ServerSocket server = new ServerSocket();
        server.bind(new InetSocketAddress(port));
        System.out.println("start server");

        try {
            while(true) {
                //监听客户端的TCP连接, 收到连接后将其封装成task, 由线程池执行
                executor.execute(new ServiceTask(server.accept()));
            }
        } finally {
            server.close();
        }
    }

    @Override
    public void register(Class serviceInterface, Class impl) {
        registryMap.put(serviceInterface.getName(), impl);
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int getPort() {
        return port;
    }

    private static class ServiceTask implements Runnable {
        private Socket client = null;

        public ServiceTask() {
        }

        ServiceTask(Socket client) {
            this.client = client;
        }


        @Override
        public void run() {
            ObjectInputStream input = null;
            ObjectOutputStream output = null;

            try {
                //将客户端发送的码流反序列化成对象,反射调用服务实现者,获取执行结果
                input = new ObjectInputStream(client.getInputStream());
                String serviceName = input.readUTF();
                String methodName = input.readUTF();
                Class<?>[] parameterTypes = (Class<?>[]) input.readObject();
                Object[] arguments = (Object[]) input.readObject();
                Class serviceClass = registryMap.get(serviceName);
                if(null == serviceClass) {
                    throw new ClassNotFoundException(serviceName + "not found");
                }
                Method method = serviceClass.getMethod(methodName, parameterTypes);
                Object result = method.invoke(serviceClass.newInstance(), arguments);

                //将执行结果反序列化,通过socket发送给客户端
                output = new ObjectOutputStream(client.getOutputStream());
                output.writeObject(result);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if(output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(client != null) {
                    try {
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
