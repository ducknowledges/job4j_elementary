package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LessThenTest {
    @Test
    public void whenFirstLess() {
        assertTrue(LessThen.check(1, 2));
    }

    @Test
    public void whenFirstGreat() {
        assertFalse(LessThen.check(10, 2));
    }
}