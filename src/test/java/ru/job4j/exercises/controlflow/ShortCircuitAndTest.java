package ru.job4j.exercises.controlflow;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ShortCircuitAndTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ShortCircuitAnd.main(null);
        String ln = System.lineSeparator();
        assertEquals(out.toString(), "A" + ln);
    }
}