package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckTest {
    @Test
    public void whenEven() {
        assertTrue(EvenCheck.check(2));
    }

    @Test
    public void whenNotEven() {
        assertFalse(EvenCheck.check(3));
    }
}