package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Kiss");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        gav.giveNick("Bless");
        black.eat("fish");
        black.show();
    }
}
