package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LikenTest {

    @Test
    public void out() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Liken.main(null);
        String firstLine = "true" + System.lineSeparator();
        String secondLine = "false" + System.lineSeparator();
        String thirdLine = "false" + System.lineSeparator();
        assertEquals(firstLine + secondLine + thirdLine, out.toString());
    }

}