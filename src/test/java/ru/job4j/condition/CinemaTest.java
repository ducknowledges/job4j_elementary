package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CinemaTest {

    @Test
    public void whenAccess19ThenWelcomeToTheCinema() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int in = 19;
        String firstLine = "The age of the customer is : " + in + System.lineSeparator();
        String secondLine = "Welcome to the cinema." + System.lineSeparator();
        String expected = firstLine + secondLine;

        Cinema.access(in);
        assertEquals(expected, out.toString());
    }

    @Test
    public void whenAccess17ThenItIsNotForYou() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int in = 17;
        String firstLine = "The age of the customer is : " + in + System.lineSeparator();
        String secondLine = "It is not for you." + System.lineSeparator();
        String expected = firstLine + secondLine;

        Cinema.access(in);
        assertEquals(expected, out.toString());
    }
}