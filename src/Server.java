import java.io.IOException;
import java.net.ServerSocket;

public class Server implements Runnable{

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class ConnectionHandler implements Runnable{

        @Override
        public void run() {

        }
    }
}
