package ru.job4j.exercises.loops;

public class Cryptography {
    public static String code(String s) {
        if (s.isEmpty()) {
            s = "empty";
        } else if (s.length() > 4) {
            StringBuilder string = new StringBuilder(s);
            for (int i = 0; i < s.length() - 4; i++) {
                string.setCharAt(i, '#');
            }
            s = string.toString();
        }
        return s;
    }
}
