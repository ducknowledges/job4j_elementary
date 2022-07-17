package ru.job4j.exercises.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class InputCalculationTest {

    @Test
    public void whenInput1And1Then2011() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        InputCalculation.main(null);
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("0").add("1").add("1");
        assertThat(out.toString(), is(expect.toString()));
    }

    @Test
    public void whenInput2And2Then4041() {
        ByteArrayInputStream in = new ByteArrayInputStream("2 2".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        InputCalculation.main(null);
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("4").add("0").add("4").add("1");
        assertThat(out.toString(), is(expect.toString()));
    }
}