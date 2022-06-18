package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointEqTest {
    @Test
    public void when12And12ThenTrue() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 2;
        int y2 = 2;
        boolean actual = PointEq.eq(x1, y1, x2, y2);
        Assert.assertTrue(actual);
    }

    @Test
    public void when02And12ThenTrue() {
        int x1 = 0;
        int x2 = 1;
        int y1 = 2;
        int y2 = 2;
        boolean actual = PointEq.eq(x1, y1, x2, y2);
        Assert.assertFalse(actual);
    }
}