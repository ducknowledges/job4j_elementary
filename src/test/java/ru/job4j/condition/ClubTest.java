package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ClubTest {
    @Test
    public void whenPermissionTrueAndTrueThenGo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        boolean beFriend = true;
        boolean hasMoney = true;
        String expected = "I can go to the club." + System.lineSeparator();
        Club.permission(hasMoney, beFriend);
        Assert.assertEquals(expected, out.toString());
    }

    @Test
    public void whenPermissionTrueAndFalseThenGo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        boolean beFriend = true;
        boolean hasMoney = false;
        String expected = "I can go to the club." + System.lineSeparator();
        Club.permission(hasMoney, beFriend);
        Assert.assertEquals(expected, out.toString());
    }

    @Test
    public void whenPermissionFalseAndTrueThenGo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        boolean beFriend = false;
        boolean hasMoney = true;
        String expected = "I can go to the club." + System.lineSeparator();
        Club.permission(hasMoney, beFriend);
        Assert.assertEquals(expected, out.toString());
    }

    @Test
    public void whenPermissionFalseAndFalseThenNotGo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        boolean beFriend = false;
        boolean hasMoney = false;
        String expected = "I can't." + System.lineSeparator();
        Club.permission(hasMoney, beFriend);
        Assert.assertEquals(expected, out.toString());
    }
}