import TestingMocks.InputForTesting;
import TestingMocks.OutputForTesting;
import TestingMocks.OutputStreamsMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by andacabrera29 on 2/25/16.
 */
public class HandleUserThreadTest {

    InputForTesting input = new InputForTesting();
    OutputForTesting output = new OutputForTesting();
    OutputStreamsMock outputStreams = new OutputStreamsMock();
    HandleUserThread userThread;

        @Before
        public void setUp() throws Exception {
            HandleUserThread userThread = new HandleUserThread(input, output, outputStreams);
            input.addInput("");
            input.addInput("Anda");
            input.addInput("Anda");
            Thread thread = new Thread(userThread);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void checkWelcomeMessage() {

            assertEquals("Welcome to the chatroom. Please enter a username", output.revealOutputStream(0));
        }

        @Test
        public void reenterUserNameMessage() {
            assertEquals("Please enter a user name! Pretty please...", output.revealOutputStream(1));
        }
//
//        @Test
//        public void transmitName() {
//            assertEquals("Anda", output.revealOutputStream(2));
//        }
    }
