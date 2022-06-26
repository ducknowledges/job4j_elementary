package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LengthArrayArraysTest {
    @Test
    public void printArrayElements() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = """
                Размер вложенного массива равен: 1
                Размер вложенного массива равен: 2
                Размер вложенного массива равен: 3
                Размер вложенного массива равен: 4
                """;
        LengthArrayArrays.main(null);
        Assert.assertEquals(expected, out.toString());
    }
}