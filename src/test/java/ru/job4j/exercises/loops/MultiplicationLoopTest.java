package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationLoopTest {

    @Test
    public void whenMultiplicationFrom0to2Then0() {
        assertEquals(0, MultiplicationLoop.multiplication(0, 2));
    }

    @Test
    public void whenMultiplicationFrom1to2Then2() {
        assertEquals(2, MultiplicationLoop.multiplication(1, 2));
    }

    @Test
    public void whenMultiplicationFrom1to3Then6() {
        assertEquals(6, MultiplicationLoop.multiplication(1, 3));
    }

}