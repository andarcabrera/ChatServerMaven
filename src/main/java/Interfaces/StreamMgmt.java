package Interfaces;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

/**
 * Created by andacabrera29 on 2/23/16.
 */
public interface StreamMgmt {
    HashSet<PrintWriter> activeOutputStreams = new HashSet<PrintWriter>();

    public void registerOutputStream(PrintWriter newOutputStream);

    public void unregisterOutputStream(OutputStream closedOutputStream);

    public void transmitMessage(String message) throws IOException;
}
