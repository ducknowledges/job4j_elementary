package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void whenNameIsSuperMarioThenSuperMario() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String name = "super mario";
        String expected = "Start - super mario" + System.lineSeparator();
        Game.menu(name);
        assertEquals(expected, out.toString());

    }

    @Test
    public void whenNameIsTanksThenTanks() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String name = "tanks";
        String expected = "Start - tanks" + System.lineSeparator();
        Game.menu(name);
        assertEquals(expected, out.toString());

    }

    @Test
    public void whenNameIsTetrisThenTetris() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String name = "tetris";
        String expected = "Start - tetris" + System.lineSeparator();
        Game.menu(name);
        assertEquals(expected, out.toString());

    }
}