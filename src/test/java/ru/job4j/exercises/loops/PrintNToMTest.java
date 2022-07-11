package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class PrintNToMTest {

    @Test
    public void when2to4Then23() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintNToM.out(2, 4);
        var expect = new StringJoiner(
                System.lineSeparator(),
                "",
                System.lineSeparator()
        ).add("2").add("3").toString();
        assertEquals(out.toString(), expect);
    }

    @Test
    public void when1to3Then12() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PrintNToM.out(1, 3);
        var expect = new StringJoiner(
                System.lineSeparator(),
                "",
                System.lineSeparator()
        ).add("1").add("2").toString();
        assertEquals(out.toString(), expect);
    }
}