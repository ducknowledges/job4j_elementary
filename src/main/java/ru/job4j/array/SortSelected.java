package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int current = 0; current < data.length; current++) {
            int min = MinDiapason.findMin(data, current, data.length - 1);
            int indexOfMin = FindLoop.indexInRange(data, min, current, data.length - 1);
            SwitchArray.swap(data, indexOfMin, current);
        }
        return data;
    }
}
