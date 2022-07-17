package ru.job4j.exercises.firstprogram;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PingPongTest {
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        PingPong.main(null);
        String expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Ping").add("Pong").toString();
        assertThat(out.toString(), is(expected));
    }
}