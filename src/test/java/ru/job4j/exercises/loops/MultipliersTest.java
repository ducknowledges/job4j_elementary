package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MultipliersTest {

    @Test
    public void when1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Multipliers.out(1);
        String ln = System.lineSeparator();
        assertEquals(out.toString(), "1" + ln);
    }

    @Test
    public void when2Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Multipliers.out(2);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "1" + ln +
                       "2" + ln
        );
    }

    @Test
    public void when6Then1236() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Multipliers.out(6);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "1" + ln +
                       "2" + ln +
                       "3" + ln +
                       "6" + ln
        );
    }

}