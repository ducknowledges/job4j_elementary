package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumFromZeroToFiveThenFifteen() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int actual = Counter.sum(start, finish);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromMinusTenToTenThenZero() {
        int start = -10;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}