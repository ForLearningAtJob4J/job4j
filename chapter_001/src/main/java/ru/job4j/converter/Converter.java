package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int euroIn = 140;
        int euroOut = Converter.rubleToEuro(euroIn);
        System.out.println("140 rubles are 2 euro. Test result: " + (euroOut == 2));
        int dollarsIn = 180;
        int dollarsOut = Converter.rubleToDollar(dollarsIn);
        System.out.println("180 rubles are 3 dollars. Test result: " +  (dollarsOut == 3));
    }
}
