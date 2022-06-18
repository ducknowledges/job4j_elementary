package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {
    @Test
    public void nameOfDay1() {
        int in = 1;
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameOfDay2() {
        int in = 2;
        String expected = "Вторник";
        String actual = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameOfDay3() {
        int in = 3;
        String expected = "Среда";
        String actual = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameOfDay4() {
        int in = 4;
        String expected = "Четверг";
        String actual = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameOfDay5() {
        int in = 5;
        String expected = "Пятница";
        String actual = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameOfDay6() {
        int in = 6;
        String expected = "Суббота";
        String actual = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameOfDay7() {
        int in = 7;
        String expected = "Воскресенье";
        String actual = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nameOfDay8() {
        int in = 0;
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(in);
        Assert.assertEquals(expected, actual);
    }
}
