package ru.job4j.exercises.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MathAbsTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathAbs.main(null);
        String ln = System.lineSeparator();
        assertEquals(out.toString(), "5.0" + ln);
    }
}