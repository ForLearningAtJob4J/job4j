package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        System.out.println("ИГРА 11");
        System.out.println("=======");
        Scanner input = new Scanner(System.in);
        int matches = 11;
        boolean first = true;
        while (matches > 0) {
            System.out.println("Количество спичек на столе: " + matches);
            System.out.print(((first) ? "Первы" : "Второ") + "й игрок, твой ход. Сколько спичек возьмёшь? ");
            int select = Integer.parseInt(input.nextLine());
            if (select < 1 || select > 3) {
                System.out.println("Брать можно от 1 до 3 спичек!");
            } else if (select > matches) {
                System.out.println("Нельзя взять спичек больше, чем их осталось!");
            } else {
                first = !first;
                matches -= select;
            }
        }
        System.out.println("Игра окончена! Выиграл " + ((!first) ? "ПЕРВЫ" : "ВТОРО") + "Й игрок");
    }
}
