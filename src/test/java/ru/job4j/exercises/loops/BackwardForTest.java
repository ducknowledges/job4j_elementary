package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class BackwardForTest {

    @Test
    public void whenFrom5To1Then5432() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BackwardFor.out(5, 1);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("5")
                .add("4")
                .add("3")
                .add("2")
                .toString();
        assertEquals(out.toString(), expect);
    }
}