package ru.job4j.exercises.arrays;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        int crossCounter = getCountCrossEl(left, right);
        if (crossCounter == 0) {
            System.out.print("");
        } else  {
            System.out.println(crossCounter);
        }
    }

    private static int getCountCrossEl(int[] left, int[] right) {
        int crossCounter = 0;
        for (int number1: left) {
            for (int number2: right) {
                crossCounter += number1 == number2 ? 1 : 0;
            }
        }
        return crossCounter;
    }
}
