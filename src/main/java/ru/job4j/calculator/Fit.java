package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 172;
        double man = Fit.manWeight(height);
        System.out.println("Man 172 is " + man);
        height = 162;
        double woman = Fit.womanWeight(height);
        System.out.println("Man 162 is " + woman);
    }
}
