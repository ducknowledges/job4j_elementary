package ru.job4j.exercises.controlflow;

public class LeapYear {
    public static boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
