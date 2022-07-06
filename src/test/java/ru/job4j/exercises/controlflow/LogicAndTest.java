package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicAndTest {
    @Test
    public void whenNotEvenAndNegativeThenFalse() {
        assertFalse(LogicAnd.check(-1));
    }

    @Test
    public void whenNotEvenAndPositiveThenFalse() {
        assertFalse(LogicAnd.check(1));
    }

    @Test
    public void whenEvenAndPositiveThenTrue() {
        assertTrue(LogicAnd.check(2));
    }
}