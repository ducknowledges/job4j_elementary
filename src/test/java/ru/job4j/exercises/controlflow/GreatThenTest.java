package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreatThenTest {

    @Test
    public void whenFirstLess() {
        assertFalse(GreatThen.check(1, 2));
    }

    @Test
    public void whenFirstGreat() {
        assertTrue(GreatThen.check(10, 2));
    }
}