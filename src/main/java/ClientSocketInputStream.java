import Interfaces.InputStream;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by andacabrera29 on 2/23/16.
 */
public class ClientSocketInputStream implements InputStream{
    BufferedReader input = null;

    public ClientSocketInputStream(BufferedReader input) {
        this.input = input;
    }

    public String readMessage() {
        String message = null;
        try {
            message = input.readLine();
        } catch (IOException e) {
            System.out.println("Caught socket closed exception!");
//            e.printStackTrace();
        }
        return message;
    }
}
