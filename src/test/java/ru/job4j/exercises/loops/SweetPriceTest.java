package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SweetPriceTest {

    @Test
    public void when10Then1020304050() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        SweetPrice.out(10);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "10" + ln +
                       "20" + ln +
                       "30" + ln +
                       "40" + ln +
                       "50" + ln
        );
    }
}