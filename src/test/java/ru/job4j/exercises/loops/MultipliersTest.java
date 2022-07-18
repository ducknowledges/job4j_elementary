package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class MultipliersTest {

    @Test
    public void when1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Multipliers.out(1);
        String expect = "1" + System.lineSeparator();
        assertEquals(out.toString(), expect);
    }

    @Test
    public void when2Then12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Multipliers.out(2);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("1")
                .add("2")
                .toString();
        assertEquals(out.toString(), expect);
    }

    @Test
    public void when6Then1236() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Multipliers.out(6);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("1")
                .add("2")
                .add("3")
                .add("6")
                .toString();
        assertEquals(out.toString(), expect);
    }

}