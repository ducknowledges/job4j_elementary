package ru.job4j.exercises.loops;

public class OddCount {
    public static int count(int a, int b) {
        int counter = 0;
        for (int i = a; i < b + 1; i++) {
            if (i % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }
}
