package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        new Scanner(System.in).nextLine();
        int answer = new Random().nextInt(3);
        String message;
        switch (answer) {
            case 0:
                message = "Да";
                break;
            case 1:
                message = "Нет";
                break;
            default:
                message = "Может быть";
                break;
        }
        System.out.println(message);
    }
}
