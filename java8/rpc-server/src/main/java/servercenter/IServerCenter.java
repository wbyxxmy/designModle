package servercenter;

import java.io.IOException;

/**
 * @author xinjian.ye
 * @date 2019/1/7
 */
public interface IServerCenter {
    void stop();

    void start() throws IOException;

    void register(Class serviceInterface, Class impl);

    boolean isRunning();

    int getPort();
}
