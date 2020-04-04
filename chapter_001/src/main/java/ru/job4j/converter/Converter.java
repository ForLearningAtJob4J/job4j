package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int rubles = 140;
        int euros = Converter.rubleToEuro(rubles);
        System.out.println("140 rubles are 2 euro. Test result: " + (euros == 2));
        rubles = 180;
        int dollars = Converter.rubleToDollar(rubles);
        System.out.println("180 rubles are 3 dollars. Test result: " +  (dollars == 3));
    }
}
