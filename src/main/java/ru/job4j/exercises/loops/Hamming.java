package ru.job4j.exercises.loops;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int distance = 0;
        for (int i = 0; i < left.length(); i++) {
            distance += left.charAt(i) == right.charAt(i) ? 0 : 1;
        }
        return distance;
    }
}
