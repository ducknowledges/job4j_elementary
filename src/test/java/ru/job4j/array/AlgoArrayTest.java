package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AlgoArrayTest {
    @Test
    public void printArrayElementsByAsc() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = """
                1
                2
                3
                4
                5
                """;
        AlgoArray.main(null);
        Assert.assertEquals(expected, out.toString());
    }
}