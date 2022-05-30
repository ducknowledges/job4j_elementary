package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result1);

        double result2 = Point.distance(10, 20, 30, 40);
        System.out.println("result (10, 20) to (30, 40) " + result2);
    }
}
