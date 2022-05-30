package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        int roublesInEuro = 70;
        float rsl = value / roublesInEuro;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        int dollarsInEuro = 60;
        float rsl = value / dollarsInEuro;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}
