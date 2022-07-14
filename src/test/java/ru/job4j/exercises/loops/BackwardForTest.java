package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BackwardForTest {

    @Test
    public void whenFrom5To1Then5432() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BackwardFor.out(5, 1);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "5" + ln +
                       "4" + ln +
                       "3" + ln +
                       "2" + ln
        );
    }

}