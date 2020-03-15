package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        while (salary < amount * (1 + percent / 100)) {
            amount = (int) (amount * percent / 100) - salary;
            year++;
        }
        return year;
    }
}
