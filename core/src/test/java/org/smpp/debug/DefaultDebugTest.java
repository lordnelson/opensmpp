package org.smpp.debug;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefaultDebugTest {
    private static final Object OBJECT = new Object() {
        @Override
        public String toString() {
            return "OBJECT";
        }
    };
    private static final String NAME = "NAME";
    private static final String EMPTY = "";

    private ByteArrayOutputStream out;

    private DefaultDebug debug;

    @Before
    public void setup() {
        debug = new DefaultDebug();
        debug.activate();
    }

    @Before
    public void setupStreams() {
        out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void testEnterWithName() {
        debug.enter(0, OBJECT, NAME);
        assertEquals("-> OBJECT NAME" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testEnterWithoutName() {
        debug.enter(0, OBJECT, EMPTY);
        assertEquals("-> OBJECT" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testExit() {
        debug.exit(0, OBJECT);
        assertEquals("<- OBJECT" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testWrite() {
        debug.write(0, "HELLO");
        assertEquals(" HELLO" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testNestedEnter() {
        debug.enter(OBJECT, NAME);
        debug.enter(OBJECT, NAME);
        assertEquals(String.format("-> OBJECT NAME%1$s  -> OBJECT NAME%1$s", System.lineSeparator()), out.toString());
    }

    @Test
    public void testNestedWrite() {
        debug.enter(0, OBJECT, NAME);
        debug.write(0, "HELLO");
        assertEquals(String.format("-> OBJECT NAME%1$s   HELLO%1$s", System.lineSeparator()), out.toString());
    }

    @Test
    public void testDeactivate() {
        debug.deactivate();
        debug.write(0, "HELLO");
        assertEquals("", out.toString());
    }

    @Test
    public void testDeactiveGroupDoesNothing() {
        debug.deactivate(0);
        debug.write(0, "HELLO");
        assertEquals(" HELLO" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testActivateGroupDoesNothing() {
        debug.deactivate();
        debug.write("HELLO");
        assertEquals("", out.toString());
        debug.activate(0);
        debug.write(0, "HELLO");
        assertEquals("", out.toString());
    }

    @Test
    public void testActiveIsAlwaysTrue() {
        assertTrue(debug.active(0));
        debug.deactivate(0);
        assertTrue(debug.active(0));
        debug.deactivate();
        assertTrue(debug.active(0));
    }
}
