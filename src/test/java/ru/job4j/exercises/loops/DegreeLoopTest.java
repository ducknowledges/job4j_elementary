package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class DegreeLoopTest {

    @Test
    public void whenCalculate2ToThePowerOf2Then2() {
        assertEquals(1, DegreeLoop.calculate(2, 0));
    }

    @Test
    public void whenCalculate2ToThePowerOf2Then4() {
        assertEquals(4, DegreeLoop.calculate(2, 2));
    }

    @Test
    public void whenCalculate3ToThePowerOf2Then9() {
        assertEquals(9, DegreeLoop.calculate(3, 2));
    }

    @Test
    public void whenCalculate3ToThePowerOf1Then3() {
        assertEquals(3, DegreeLoop.calculate(3, 1));
    }

    @Test
    public void whenCalculate2ToThePowerOf7Then128() {
        assertEquals(128, DegreeLoop.calculate(2, 7));
    }
}