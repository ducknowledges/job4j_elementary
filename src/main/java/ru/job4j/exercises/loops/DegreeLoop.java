package ru.job4j.exercises.loops;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
}
