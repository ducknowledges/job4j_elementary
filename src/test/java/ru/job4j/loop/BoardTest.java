package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BoardTest {

    @Test
    public void paintBoard3on3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int height = 3;
        int width = 3;
        String expect = "X X" + System.lineSeparator()
                + " X " + System.lineSeparator()
                + "X X" + System.lineSeparator();
        Board.paint(width, height);
        Assert.assertEquals(expect, out.toString());
    }

    @Test
    public void paintBoard4on4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int height = 4;
        int width = 4;
        String expect = "X X " + System.lineSeparator()
                + " X X" + System.lineSeparator()
                + "X X " + System.lineSeparator()
                + " X X" + System.lineSeparator();
        Board.paint(width, height);
        Assert.assertEquals(expect, out.toString());
    }
}