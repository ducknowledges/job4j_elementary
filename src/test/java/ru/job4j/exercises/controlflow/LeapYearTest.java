package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void checkYearFalse() {
        boolean b = LeapYear.checkYear(2019);
        assertFalse(b);
    }

    @Test
    public void checkYearFalse1() {
        boolean b = LeapYear.checkYear(1800);
        assertFalse(b);
    }

    @Test
    public void checkYearTrue() {
        boolean b = LeapYear.checkYear(2020);
        assertTrue(b);
    }

    @Test
    public void checkYearTrue1() {
        boolean b = LeapYear.checkYear(2000);
        assertTrue(b);
    }
}