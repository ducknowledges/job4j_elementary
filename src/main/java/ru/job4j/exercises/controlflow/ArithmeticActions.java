package ru.job4j.exercises.controlflow;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String action = "none";
        if (left + right == rsl) {
            action = "added";
        } else if (left - right == rsl) {
            action = "subtracted";
        } else if (left * right == rsl) {
            action = "multiplied";
        } else if (left / right == rsl) {
            action = "divided";
        }
        return action;
    }
}
