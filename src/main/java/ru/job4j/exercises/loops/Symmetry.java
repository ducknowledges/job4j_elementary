package ru.job4j.exercises.loops;

public class Symmetry {
    public static boolean check(int number) {
        String stringNumber = Integer.toString(number);
        for (int i = 0; i < stringNumber.length() / 2; i++) {
            if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
