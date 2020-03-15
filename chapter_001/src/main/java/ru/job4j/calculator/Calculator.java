package ru.job4j.calculator;

/**
 * Class for demonstrating arithmetical operation
 * @author Serge Sapunov
 */
public class Calculator {
    /**
     * Method main.
     * Entry point.
     *
     * @param args - array with command line parameters
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;

        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        int size = 0;
        size -= 5;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
