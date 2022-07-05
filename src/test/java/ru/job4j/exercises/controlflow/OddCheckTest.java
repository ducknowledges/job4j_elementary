package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddCheckTest {
    @Test
    public void whenOdd() {
        assertTrue(OddCheck.check(3));
    }

    @Test
    public void whenNotOdd() {
        assertFalse(OddCheck.check(2));
    }
}