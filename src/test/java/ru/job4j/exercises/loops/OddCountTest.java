package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddCountTest {

    @Test
    public void whenCount1to2Then1() {
        assertEquals(1, OddCount.count(1, 2));
    }

    @Test
    public void whenCount1to3Then2() {
        assertEquals(2, OddCount.count(1, 3));
    }

    @Test
    public void whenCount1to4Then2() {
        assertEquals(2, OddCount.count(1, 4));
    }

    @Test
    public void whenCount1to5Then3() {
        assertEquals(3, OddCount.count(1, 5));
    }
}