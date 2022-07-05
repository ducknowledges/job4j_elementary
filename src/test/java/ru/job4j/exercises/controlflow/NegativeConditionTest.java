package ru.job4j.exercises.controlflow;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class NegativeConditionTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        NegativeCondition.main(null);
        String ln = System.lineSeparator();
        assertEquals(out.toString(), "true" + ln + "false" + ln);
    }
}