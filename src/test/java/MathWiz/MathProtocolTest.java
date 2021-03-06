package MathWiz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MathProtocolTest {
    private MathProtocol mp;

    @Before
    public void setUp() throws Exception {
        mp = new MathProtocol();
    }

    @Test
    public void testNoNumber() {
        String infoNeeded = "You need to give the MATH WIZ some numbers and operators to play with";
        assertEquals(infoNeeded, mp.process(""));
        assertEquals(infoNeeded, mp.process("MATH:No digits +"));
        assertEquals(infoNeeded, mp.process("MATH:No operators 344 4353"));
        assertEquals(infoNeeded, mp.process("MATH:No digits or operators"));
    }

    @Test
    public void testOperationWithNumbers() {
        assertEquals("3", mp.process("MATH:1 + 1"));
        assertEquals("3", mp.process("MATH:1 + 2"));
        assertEquals("4", mp.process("MATH:2 * 2"));
        assertEquals("8", mp.process("MATH:2 + 2 *2"));
        assertEquals("50", mp.process("MATH:10 *10 /2"));
        assertEquals("It looks like you have too many or too few operators", mp.process("MATH:10 *10 /2 9"));
        assertEquals("It looks like you have too many or too few operators", mp.process("MATH:10 *10 /2 9 - -"));
    }

}