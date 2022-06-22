package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArrayDefinitionTest {
    @Test
    public void printArraysSize() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "10\n100500\n40\n";
        ArrayDefinition.main(null);
        Assert.assertEquals(expected, out.toString());
    }
}