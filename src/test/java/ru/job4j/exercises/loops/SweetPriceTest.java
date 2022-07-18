package ru.job4j.exercises.loops;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class SweetPriceTest {

    @Test
    public void when10Then1020304050() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        SweetPrice.out(10);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("10")
                .add("20")
                .add("30")
                .add("40")
                .add("50")
                .toString();
        assertEquals(out.toString(), expect);
    }
}