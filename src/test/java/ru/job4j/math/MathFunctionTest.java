package ru.job4j.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathFunctionTest {

    @Test
    public void whenSum0dot1And0dot2Then0dot3() {
        double first = 0.1;
        double second = 0.2;
        double expected = 0.3;
        double actual = MathFunction.sum(first, second);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenMultiply0dot1And0dot2Then0dot02() {
        double first = 0.1;
        double second = 0.2;
        double expected = 0.02;
        double actual = MathFunction.multiply(first, second);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenDifference0dot1And0dot2ThenMinus0dot1() {
        double first = 0.1;
        double second = 0.2;
        double expected = -0.1;
        double actual = MathFunction.difference(first, second);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenDivision0dot1By0dot2Then0dot5() {
        double first = 0.1;
        double second = 0.2;
        double expected = 0.5;
        double actual = MathFunction.division(first, second);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }
}