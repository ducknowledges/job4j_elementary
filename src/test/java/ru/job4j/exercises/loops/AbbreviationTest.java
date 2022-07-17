package ru.job4j.exercises.loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbbreviationTest {
    @Test
    public void collectNATO() {
        String s = "North Atlantic Treaty Organization";
        String rsl = Abbreviation.collect(s);
        assertEquals(rsl, "NATO");
    }

    @Test
    public void collectCEO() {
        String s = "Chief Executive Officer";
        String rsl = Abbreviation.collect(s);
        assertEquals(rsl, "CEO");
    }

    @Test
    public void collectUNO() {
        String s = "United Nations Organization";
        String rsl = Abbreviation.collect(s);
        assertEquals(rsl, "UNO");
    }
}