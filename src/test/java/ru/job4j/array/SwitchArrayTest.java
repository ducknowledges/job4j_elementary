package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwapBorder() {
        int[] in = {3, 1, 5, 4};
        int[] expected = {4, 1, 5, 3};
        int[] actual = SwitchArray.swapBorder(in);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = 3;
        int[] actual = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 2;
        int[] actual = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        Assert.assertArrayEquals(expected, actual);
    }
}