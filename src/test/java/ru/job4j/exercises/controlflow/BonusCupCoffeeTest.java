package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class BonusCupCoffeeTest {
    @Test
    public void when7CupsAnd6BonusThen8() {
        int rsl = BonusCupCoffee.countCup(7, 6);
        assertEquals(rsl, 8);
    }

    @Test
    public void when213CupsAnd6BonusThen248() {
        int rsl = BonusCupCoffee.countCup(213, 6);
        assertEquals(rsl, 248);
    }
}