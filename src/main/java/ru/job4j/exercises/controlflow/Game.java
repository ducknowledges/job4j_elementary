package ru.job4j.exercises.controlflow;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        return Math.max((int) (percent * prize) - pay, 0);
    }
}
