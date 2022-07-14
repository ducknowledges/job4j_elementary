package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class PrintNTo0Test {

    @Test
    public void when3Then210() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintNTo0.out(3);
        var expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("1").add("0").toString();
        assertEquals(out.toString(), expect);
    }

    @Test
    public void when2Then10() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintNTo0.out(2);
        var expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("0").toString();
        assertEquals(out.toString(), expect);
    }
}