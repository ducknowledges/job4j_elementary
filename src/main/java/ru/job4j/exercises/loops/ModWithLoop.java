package ru.job4j.exercises.loops;

public class ModWithLoop {
    public static int mod(int n, int d) {
        while (n >= d) {
            n -= d;
        }
        return n;
    }
}
