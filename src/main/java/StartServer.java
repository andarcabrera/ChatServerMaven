import java.io.IOException;

/**
 * Created by andacabrera29 on 2/23/16.
 */
public class StartServer {
    public static void main(String[] args) throws IOException {
        ChatServer server = new ChatServer();
        server.listen();
    }
}
