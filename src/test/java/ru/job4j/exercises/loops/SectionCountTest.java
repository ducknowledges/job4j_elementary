package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class SectionCountTest {

    @Test
    public void whenCountSection1InLength1Then1() {
        assertEquals(1, SectionCount.count(1, 1));
    }

    @Test
    public void whenCountSection1InLength2Then2() {
        assertEquals(2, SectionCount.count(2, 1));
    }

    @Test
    public void whenCountSection2InLength3Then1() {
        assertEquals(1, SectionCount.count(3, 2));
    }

    @Test
    public void whenCountSection2InLength4Then2() {
        assertEquals(2, SectionCount.count(4, 2));
    }

}