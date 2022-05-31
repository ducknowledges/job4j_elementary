package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when43to21then2dot82() {
        double expected = 2.82;
        int x1 = 4;
        int y1 = 3;
        int x2 = 2;
        int y2 = 1;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when12to34then2dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when1020to3040then28dot28() {
        double expected = 28.28;
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 40;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }
}