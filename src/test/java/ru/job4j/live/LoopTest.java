package ru.job4j.live;

import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoopTest {
    @Test
    public void printFromZeroToTen() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String expected = "0" + System.lineSeparator()
                + "1" + System.lineSeparator()
                + "2" + System.lineSeparator()
                + "3" + System.lineSeparator()
                + "4" + System.lineSeparator()
                + "5" + System.lineSeparator()
                + "6" + System.lineSeparator()
                + "7" + System.lineSeparator()
                + "8" + System.lineSeparator()
                + "9" + System.lineSeparator()
                + "10" + System.lineSeparator();
        Loop.main(null);
        Assert.assertEquals(expected, out.toString());
    }
}