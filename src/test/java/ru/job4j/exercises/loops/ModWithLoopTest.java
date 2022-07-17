package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModWithLoopTest {

    @Test
    public void whenMod4on2Then0() {
        assertEquals(0, ModWithLoop.mod(4, 2));
    }

    @Test
    public void whenMod3on2Then1() {
        assertEquals(1, ModWithLoop.mod(3, 2));
    }

    @Test
    public void whenMod8on3Then2() {
        assertEquals(2, ModWithLoop.mod(8, 3));
    }

    @Test
    public void whenMod0on3Then0() {
        assertEquals(0, ModWithLoop.mod(0, 3));
    }
}