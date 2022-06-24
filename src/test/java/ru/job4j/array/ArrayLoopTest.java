package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayLoopTest {
    @Test
    public void printArrayElements() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = """
                3
                5
                7
                9
                11
                """;
        ArrayLoop.main(null);
        Assert.assertEquals(expected, out.toString());
    }
}