package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class Print0ToNTest {

    @Test
    public void out3() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print0ToN.out(3);
        var expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("1").add("2").toString();
        assertEquals(out.toString(), expect);
    }

    @Test
    public void out2() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print0ToN.out(2);
        var expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("1").toString();
        assertEquals(out.toString(), expect);
    }
}