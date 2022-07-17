package ru.job4j.exercises.loops;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num >= 10) {
           sum += num % 10;
           num /= 10;
        }
        sum += num;
        return sum;
    }
}
