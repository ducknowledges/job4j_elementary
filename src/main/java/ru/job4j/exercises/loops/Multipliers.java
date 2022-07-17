package ru.job4j.exercises.loops;

public class Multipliers {
    public static void out(int n) {
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
