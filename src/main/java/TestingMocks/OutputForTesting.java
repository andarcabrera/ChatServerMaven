package TestingMocks;

import java.util.ArrayList;

/**
 * Created by andacabrera29 on 2/23/16.
 */
public class OutputForTesting {
    private ArrayList<String> messagesFromServer = new ArrayList<String>();

    public void writeMessage(String message) {
        messagesFromServer.add(message);
    }

    public synchronized String revealOutputStream(int position) {
        String message;
        if (messagesFromServer.size() >= 1) {
            message = messagesFromServer.get(position);
        } else {
            message = "Nothin'";
        }
        return message;
    }

    public synchronized void emptyStream() {
        if (!messagesFromServer.isEmpty()) {
            messagesFromServer.clear();
        }
    }

    public synchronized int length() {
        return messagesFromServer.size();
    }
}
