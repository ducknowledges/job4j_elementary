package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SlashTest {
    @Test
    public void drawThreeSizeSlash() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int in = 3;
        String expected = "0 0" + System.lineSeparator()
                + " 0 " + System.lineSeparator()
                + "0 0" + System.lineSeparator()
                + System.lineSeparator();
        Slash.draw(in);
        Assert.assertEquals(expected, out.toString());
    }

    @Test
    public void drawFiveSizeSlash() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int in = 5;
        String expected = "0   0" + System.lineSeparator()
                + " 0 0 " + System.lineSeparator()
                + "  0  " + System.lineSeparator()
                + " 0 0 " + System.lineSeparator()
                + "0   0" + System.lineSeparator()
                + System.lineSeparator();
        Slash.draw(in);
        Assert.assertEquals(expected, out.toString());
    }
}