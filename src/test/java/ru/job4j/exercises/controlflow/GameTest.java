package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void checkGame() {
        int rsl = Game.checkGame(0.2, 50, 9);
        assertEquals(rsl, 1);
    }

    @Test
    public void checkGameIs0() {
        int rsl = Game.checkGame(0.9, 1, 2);
        assertEquals(rsl, 0);
    }
}