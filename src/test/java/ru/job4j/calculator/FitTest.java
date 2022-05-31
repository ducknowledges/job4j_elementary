package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan172Then82dot8() {
        short in = 172;
        double expected = 82.8;
        double actual = Fit.manWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWoman162Then59dot8() {
        short in = 162;
        double expected = 59.8;
        double actual = Fit.womanWeight(in);
        Assert.assertEquals(expected, actual, 0.01);
    }
}