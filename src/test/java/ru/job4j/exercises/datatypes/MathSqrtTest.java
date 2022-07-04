package ru.job4j.exercises.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MathSqrtTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathSqrt.main(null);
        String ln = System.lineSeparator();
        assertEquals(out.toString(), "3.0" + ln);
    }
}