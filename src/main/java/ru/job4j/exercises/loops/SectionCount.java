package ru.job4j.exercises.loops;

public class SectionCount {
    public static int count(int length, int section) {
        int counter = 0;
        while (length >= section) {
            length -= section;
            counter += 1;
        }
        return counter;
    }
}
