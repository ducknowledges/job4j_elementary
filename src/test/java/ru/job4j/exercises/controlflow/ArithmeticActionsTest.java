package ru.job4j.exercises.controlflow;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticActionsTest {
    @Test
    public void selectActionAdded() {
        String action = ArithmeticActions.selectAction(5, 10, 15);
        assertEquals(action, "added");
    }

    @Test
    public void selectActionSubtracted() {
        String action = ArithmeticActions.selectAction(10, 5, 5);
        assertEquals(action, "subtracted");
    }

    @Test
    public void selectActionMultiplied() {
        String action = ArithmeticActions.selectAction(3, 5, 15);
        assertEquals(action, "multiplied");
    }

    @Test
    public void selectActionDivided() {
        String action = ArithmeticActions.selectAction(15, 5, 3);
        assertEquals(action, "divided");
    }

    @Test
    public void selectActionNone() {
        String action = ArithmeticActions.selectAction(1, 10, 100);
        assertEquals(action, "none");
    }
}