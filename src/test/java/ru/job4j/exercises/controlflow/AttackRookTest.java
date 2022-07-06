package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class AttackRookTest {
    @Test
    public void whenA8AndE8checkThenTrue() {
        boolean check = AttackRook.check("A8", "E8");
        assertTrue(check);
    }

    @Test
    public void whenH4AndH3checkThenTrue() {
        boolean check = AttackRook.check("H4", "H3");
        assertTrue(check);
    }

    @Test
    public void whenA1AndB2checkThenFalse() {
        boolean check = AttackRook.check("A1", "B2");
        assertFalse(check);
    }

    @Test
    public void whenF5AndC8checkThenFalse() {
        boolean check = AttackRook.check("F5", "C8");
        assertFalse(check);
    }
}