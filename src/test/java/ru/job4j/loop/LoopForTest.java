package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.condition.AlterDivByZero;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LoopForTest {
    @Test
    public void printFrom5To10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String expected = "5\n6\n7\n8\n9\n10\n";
        LoopFor.main(null);

        assertEquals(expected, out.toString());
    }
}