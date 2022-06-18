package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GamesTest {
    @Test
    public void whenPermissionTrueAndTrueThenGo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        boolean allowByParent = true;
        boolean hasMoney = true;
        String expected = "I can go to the computer club." + System.lineSeparator();
        Games.permission(allowByParent, hasMoney);
        Assert.assertEquals(expected, out.toString());
    }

    @Test
    public void whenPermissionTrueAndFalseThenNotGo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        boolean allowByParent = true;
        boolean hasMoney = false;
        String expected = "I can't." + System.lineSeparator();
        Games.permission(allowByParent, hasMoney);
        Assert.assertEquals(expected, out.toString());
    }

    @Test
    public void whenPermissionFalseAndTrueThenNotGo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        boolean allowByParent = false;
        boolean hasMoney = false;
        String expected = "I can't." + System.lineSeparator();
        Games.permission(allowByParent, hasMoney);
        Assert.assertEquals(expected, out.toString());
    }

    @Test
    public void whenPermissionFalseAndFalseThenNotGo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        boolean allowByParent = false;
        boolean hasMoney = false;
        String expected = "I can't." + System.lineSeparator();
        Games.permission(allowByParent, hasMoney);
        Assert.assertEquals(expected, out.toString());
    }
}
