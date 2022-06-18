package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {
    @Test
    public void whenIsEven4ThenTrue() {
        int in = 4;
        boolean actual = LogicNot.isEven(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenIsEven5ThenFalse() {
        int in = 5;
        boolean actual = LogicNot.isEven(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenNotEven5ThenTrue() {
        int in = 5;
        boolean actual = LogicNot.notEven(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenNotEven4ThenFalse() {
        int in = 4;
        boolean actual = LogicNot.notEven(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenIsPositive4ThenTrue() {
        int in = 4;
        boolean actual = LogicNot.isPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenIsPositiveMinus4ThenFalse() {
        int in = -4;
        boolean actual = LogicNot.isPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenNotPositiveMinus4ThenTrue() {
        int in = -4;
        boolean actual = LogicNot.notPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenNotPositive4ThenFalse() {
        int in = 4;
        boolean actual = LogicNot.notPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenNotEvenAndPositive5ThenTrue() {
        int in = 5;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenNotEvenAndPositive5ThenFalse() {
        int in = -5;
        boolean actual = LogicNot.notEvenAndPositive(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenEvenOrNotPositiveMinus4ThenTrue() {
        int in = -4;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenEvenOrNotPositive5ThenFalse() {
        int in = 5;
        boolean actual = LogicNot.evenOrNotPositive(in);
        Assert.assertFalse(actual);
    }
}