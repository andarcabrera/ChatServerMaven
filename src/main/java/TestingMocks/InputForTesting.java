package TestingMocks;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by andacabrera29 on 2/23/16.
 */
public class InputForTesting {
    ArrayList<String> incomingMessages = new ArrayList<String>();

    public synchronized String readMessage() {
        String message;
        if (incomingMessages.size() == 1) {
            message = incomingMessages.get(0);
            incomingMessages.remove(0);
        } else {
            message = "";
        }
        return message;
    }

    public synchronized void emptyStream() {
        if (!incomingMessages.isEmpty()) {
            incomingMessages.clear();
        }
    }

    public synchronized void addInputs(String... a) {
        incomingMessages.addAll(Arrays.asList(a));
    }
}
