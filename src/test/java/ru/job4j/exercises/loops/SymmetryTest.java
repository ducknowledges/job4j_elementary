package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetryTest {
    @Test
    public void checkTrue() {
        boolean check = Symmetry.check(1112111);
        assertTrue(check);
    }

    @Test
    public void checkFalse() {
        boolean check = Symmetry.check(123456321);
        assertFalse(check);
    }
}