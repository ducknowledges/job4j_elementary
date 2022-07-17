package ru.job4j.exercises.loops;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i < b + 1; i += 2) {
            sum += i;
        }
        return sum;
    }
}
