package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitSumTest {
    @Test
    public void whenSum1Then1() {
        assertEquals(1, DigitSum.sum(1));
    }

    @Test
    public void whenSum12Then3() {
        assertEquals(3, DigitSum.sum(12));
    }

    @Test
    public void whenSum123Then6() {
        assertEquals(6, DigitSum.sum(123));
    }

    @Test
    public void whenSum1234Then10() {
        assertEquals(10, DigitSum.sum(1234));
    }

    @Test
    public void whenSum12345Then15() {
        assertEquals(15, DigitSum.sum(12345));
    }
}