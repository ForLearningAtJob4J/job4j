package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                for (Item item: tracker.findAll()) {
                    System.out.println("Id: " + item.getId() + "; Name: " + item.getName());
                }
                System.out.println("=== End list ===");
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Was successfully edited!");
                } else {
                    System.out.println("Task with specified ID was not found");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Was successfully deleted!");
                } else {
                    System.out.println("Task with specified ID was not found");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Id: " + item.getId() + "; Name: " + item.getName());
                } else {
                    System.out.println("Task with specified ID was not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                for (Item item: tracker.findByName(name)) {
                    System.out.println("Id: " + item.getId() + "; Name: " + item.getName());
                }
                System.out.println("=== End list ===");
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        StringBuilder menu = new StringBuilder();
        String ls = System.lineSeparator();
        menu.append("Menu.").append(ls)
                .append("0. Add new Item").append(ls)
                .append("1. Show all items").append(ls)
                .append("2. Edit item").append(ls)
                .append("3. Delete item").append(ls)
                .append("4. Find item by Id").append(ls)
                .append("5. Find items by name").append(ls)
                .append("6. Exit Program");
        System.out.println(menu);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}