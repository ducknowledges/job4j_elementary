package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.math.MathFunction;

import static org.junit.Assert.*;

public class MathCalculatorTest {

    @Test
    public void whenSum0dot1And0dot2AddMultiply0dot1And0dot2Then() {
        double first = 0.1;
        double second = 0.2;
        double expected = 0.32;
        double actual = MathCalculator.sumAndMultiply(first, second);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenDifference0dot1And0dot2AddDivision0dot1And0dot2Then() {
        double first = 0.1;
        double second = 0.2;
        double expected = 0.4;
        double actual = MathCalculator.differenceAndDivision(first, second);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenAllMathFunctionsSum0dot1And0dot2Then() {
        double first = 0.1;
        double second = 0.2;
        double expected = 0.72;
        double actual = MathCalculator.allMathFunctionsSum(first, second);
        double delta = 0.01;
        Assert.assertEquals(expected, actual, delta);
    }
}