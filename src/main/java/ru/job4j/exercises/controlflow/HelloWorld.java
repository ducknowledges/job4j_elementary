package ru.job4j.exercises.controlflow;

public class HelloWorld {
    public static String checkNumber(int number) {
        String output = "Operation not support";
        if (number % 3 == 0) {
            output = "Hello";
        }
        if (number % 5 == 0) {
            output = "World";
        }
        if (number % 3 == 0 && number % 5 == 0) {
            output = "Hello, World!!!";
        }
        return output;
    }
}
