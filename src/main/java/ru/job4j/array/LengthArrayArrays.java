package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {4, 5}, {7, 8, 9}, {7, 8, 9, 0}};
        for (int[] subNumbers : numbers) {
            System.out.println(
                    "Размер вложенного массива равен: " + subNumbers.length
            );
        }
    }
}
