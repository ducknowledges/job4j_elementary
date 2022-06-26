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
}