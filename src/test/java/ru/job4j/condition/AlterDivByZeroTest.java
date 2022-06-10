package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AlterDivByZeroTest {

    @Test
    public void whenPositiveThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int in = 1;
        String expected = "";
        AlterDivByZero.possibleDiv(in);

        assertEquals(expected, out.toString());
    }

    @Test
    public void when0ThenCouldNotDivBy0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int in = 0;
        String expected = "Could not div by 0." + System.lineSeparator();
        AlterDivByZero.possibleDiv(in);

        assertEquals(expected, out.toString());
    }

    @Test
    public void whenNegativeThenThisIsNegativeNumber() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int in = -1;
        String expected = "This is negative number" + System.lineSeparator();
        AlterDivByZero.possibleDiv(in);

        assertEquals(expected, out.toString());
    }
}