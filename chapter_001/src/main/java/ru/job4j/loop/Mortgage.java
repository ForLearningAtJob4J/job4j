package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double debt = amount;
        while (salary < debt * (1 + percent / 100)) {
            debt =  debt * (1 + percent / 100) - salary;
            year++;
        }
        return year;
    }
}
