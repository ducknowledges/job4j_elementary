package ru.job4j.exercises.loops;

public class MultiplicationLoop {
    public static int multiplication(int a, int b) {
        for (int i = a; i <= b; i++) {
            a *= i;
        }
        return a;
    }
}
