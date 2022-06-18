package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {
    @Test
    public void numberOfDay1() {
        String in = "Понедельник";
        int expected = 1;

        int actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);

        in = "Monday";
        actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfDay2() {
        String in = "Вторник";
        int expected = 2;

        int actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);

        in = "Tuesday";
        actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfDay3() {
        String in = "Среда";
        int expected = 3;

        int actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);

        in = "Wednesday";
        actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfDay4() {
        String in = "Четверг";
        int expected = 4;

        int actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);

        in = "Thursday";
        actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfDay5() {
        String in = "Пятница";
        int expected = 5;

        int actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);

        in = "Friday";
        actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfDay6() {
        String in = "Суббота";
        int expected = 6;

        int actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);

        in = "Saturday";
        actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfDay7() {
        String in = "Воскресенье";
        int expected = 7;

        int actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);

        in = "Sunday";
        actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    public void numberOfDayWrong() {
        String in = "wrongDay";
        int expected = -1;

        int actual = MultipleSwitchWeek.numberOfDay(in);
        Assert.assertEquals(expected, actual);
    }
}
