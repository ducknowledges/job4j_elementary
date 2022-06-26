package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
       int[] input = {4, 1, 6, 2};
       int[] expected = {2, 6, 1, 4};
       int[] actual = Turn.back(input);
       Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = Turn.back(input);
        Assert.assertArrayEquals(expected, actual);
    }
}