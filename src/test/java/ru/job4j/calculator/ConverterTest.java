package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float delta = 0.0001f;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void whenConvert160RubleThen2dot5714Euro() {
        float in = 180;
        float expected = 2.5714f;
        float out = Converter.rubleToEuro(in);
        float delta = 0.0001f;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RubleThen3dot3333Dlr() {
        float in = 200;
        float expected = 3.3333f;
        float out = Converter.rubleToDollar(in);
        float delta = 0.0001f;
        Assert.assertEquals(expected, out, delta);
    }
}