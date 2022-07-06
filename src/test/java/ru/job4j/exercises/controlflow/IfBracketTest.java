package ru.job4j.exercises.controlflow;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class IfBracketTest {
    @Test
    public void when2ThenAB() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(2);
        String ln = System.lineSeparator();
        assertEquals(out.toString(), "A" + ln + "B" + ln);
    }

    @Test
    public void when0ThenNoOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(0);
        assertEquals(out.toString(), "");
    }
}