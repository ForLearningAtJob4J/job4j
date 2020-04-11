package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first  = new Book("Clean code", 464);
        Book second = new Book("How to cook a cat", 1);
        Book third  = new Book("Devil's rituals", 666);
        Book fourth = new Book("Winnie the Pooh", 15000);

        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        System.out.println("----------------");
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getTitle() + " - " + books[index].getNumPages());
        }
        System.out.println("----------------");
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getTitle() + " - " + books[index].getNumPages());
        }
        System.out.println("----------------");
        for (int index = 0; index < books.length; index++) {
            if (books[index].getTitle().equals("Clean code")) {
                System.out.println(books[index].getTitle() + " - " + books[index].getNumPages());
            }
        }
    }
}