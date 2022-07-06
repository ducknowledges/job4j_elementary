package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicOrTest {
    @Test
    public void whenNotOddAndPositiveThenFalse() {
        assertFalse(LogicOr.check(2));
    }

    @Test
    public void whenOddAndPositiveThenTrue() {
        assertTrue(LogicOr.check(1));
    }

    @Test
    public void whenOddAndNegativeThenTrue() {
        assertTrue(LogicOr.check(-2));
    }
}