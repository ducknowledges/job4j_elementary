package ru.job4j.exercises.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MathPowTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathPow.main(null);
        String ln = System.lineSeparator();
        assertEquals(out.toString(), "9.0" + ln);
    }
}