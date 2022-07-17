package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondSumTest {

    @Test
    public void whenSumFrom1to2Then1() {
        assertEquals(1, SecondSum.sum(1, 2));
    }

    @Test
    public void whenSumFrom1to3Then4() {
        assertEquals(4, SecondSum.sum(1, 3));
    }

    @Test
    public void whenSumFrom1to4Then4() {
        assertEquals(4, SecondSum.sum(1, 4));
    }

    @Test
    public void whenSumFrom0to26Then12() {
        assertEquals(12, SecondSum.sum(0, 6));
    }
}