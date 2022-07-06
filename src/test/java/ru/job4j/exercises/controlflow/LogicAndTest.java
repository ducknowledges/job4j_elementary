package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicAndTest {
    @Test
    public void whenNotEvenAndNegative() {
        assertFalse(LogicAnd.check(-1));
    }

    @Test
    public void whenNotEvenAndPositive() {
        assertFalse(LogicAnd.check(1));
    }

    @Test
    public void whenEvenAndPositive() {
        assertTrue(LogicAnd.check(2));
    }
}