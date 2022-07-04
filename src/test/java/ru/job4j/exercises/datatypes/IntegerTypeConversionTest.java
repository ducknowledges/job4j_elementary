package ru.job4j.exercises.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class IntegerTypeConversionTest {
    @Test
    public void testOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerTypeConversion.main(null);
        String ln = System.lineSeparator();
        assertEquals(out.toString(), "1" + ln + "1" + ln);
    }
}