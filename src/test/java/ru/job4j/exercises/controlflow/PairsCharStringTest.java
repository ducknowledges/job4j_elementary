package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairsCharStringTest {
    @Test
    public void whenCheckEmptyStringsThenTrue() {
        boolean rsl = PairsCharString.check("", "");
        assertTrue(rsl);
    }

    @Test
    public void whenCheckSparklingAndGroupsThenTrue() {
        boolean rsl = PairsCharString.check("sparkling", "groups");
        assertTrue(rsl);
    }

    @Test
    public void whenCheckBookingAndGrabberThenFalse() {
        boolean rsl = PairsCharString.check("booking", "grabber");
        assertFalse(rsl);
    }
}