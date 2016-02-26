package TestingMocks;

import Interfaces.InputStream;

import java.util.ArrayList;

/**
 * Created by andacabrera29 on 2/23/16.
 */
public class InputForTesting implements InputStream{
    ArrayList<String> incomingMessages = new ArrayList<String>();

    public String readMessage() {
        String message;
        if (incomingMessages.size() > 0) {
            message = incomingMessages.get(0);
            incomingMessages.remove(0);
        } else {
            message = null;
        }
        return message;
    }

    public synchronized void emptyStream() {
        if (!incomingMessages.isEmpty()) {
            incomingMessages.clear();
        }
    }

    public synchronized void addInput(String a) {
        incomingMessages.add(a);
    }
}
