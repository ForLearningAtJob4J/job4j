package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ===");
        for (Item item: tracker.findAll()) {
            System.out.println(item);
        }
        System.out.println("=== End list ===");
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Replace item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Was successfully edited!");
        } else {
            System.out.println("Task with specified ID was not found");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Was successfully deleted!");
        } else {
            System.out.println("Task with specified ID was not found");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Task with specified ID was not found");
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        for (Item item: tracker.findByName(name)) {
            System.out.println(item);
        }
        System.out.println("=== End list ===");
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
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
                .append("2. Replace item").append(ls)
                .append("3. Delete item").append(ls)
                .append("4. Find item by Id").append(ls)
                .append("5. Find items by name").append(ls)
                .append("6. Exit Program");
        System.out.println(menu);
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}