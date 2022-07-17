package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class HammingTest {
    @Test
    public void whenCheckStringsThen3() {
        int rsl = Hamming.checkStrings("2173896", "2233796");
        assertEquals(rsl, 3);
    }

    @Test
    public void whenCheckStringsThen5() {
        int rsl = Hamming.checkStrings("abcde", "bcdef");
        assertEquals(rsl, 5);
    }

    @Test
    public void whenCheckStringsThen0() {
        int rsl = Hamming.checkStrings("abcde", "abcde");
        assertEquals(rsl, 0);
    }
}