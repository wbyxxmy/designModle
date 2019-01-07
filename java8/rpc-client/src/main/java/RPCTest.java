import serivce.impl.HelloServiceImpl;
import serivce.intf.IHelloService;
import servercenter.IServerCenter;
import servercenter.ServiceCenterImpl;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author xinjian.ye
 * @date 2019/1/7
 */
public class RPCTest {
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    IServerCenter serviceServer = new ServiceCenterImpl(8088);
                    serviceServer.register(IHelloService.class, HelloServiceImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        IHelloService service = RPCClient.getRemoteProxyObj(IHelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sayHi("test"));
    }
}
