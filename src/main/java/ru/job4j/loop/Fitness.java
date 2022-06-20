package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int ivanPowerUp = 3;
        int nikPowerUp = 2;
        int month = 0;
        while (ivan <= nik) {
            ivan *= ivanPowerUp;
            nik *= nikPowerUp;
            month += 1;
        }
        return month;
    }
}
