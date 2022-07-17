package ru.job4j.exercises.loops;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder builder = new StringBuilder().append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString().toUpperCase();
    }
}
