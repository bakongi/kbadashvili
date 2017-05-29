package ru.kbadashvili.part5;

import java.io.IOException;

/**
 * Created by KBadashvili on 016 16.05.17.
 */
public class StartUI {

    /**
     *
     */
    private Input input;
    /**
     *
     */
    private Tracker tracker;

    /**
     *
     * @param input любой Input.
     * @param tracker tracker.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     *
     * @throws IOException Exception
     */
    public void init() throws IOException {
        String id = "";
        String name = "";
        String description = "";

        String ls = System.lineSeparator();
        String menu = (
                "0. Add new Item" + ls
                        +
                        "1. Show all items" + ls
                        +
                        "2. Edit item" + ls
                        +
                        "3. Delete item" + ls
                        +
                        "4. Find item by Id" + ls
                        +
                        "5. Find items by name" + ls
                        +
                        "6. Exit Program" + ls
        );

        while (true) {
            String number = input.ask(menu);

            if (number.equals("0")) {
                name = input.ask("Please enter item name: ");
                description = input.ask("Please enter item description: ");
                if (name != null && description != null) {
                    tracker.add(new Item(name, description));
                } else {
                    break;
                }
            } else if (number.equals("1")) {
                for (Item item : tracker.findAll()) {
                    if (item != null) {
                        System.out.println(item.getId() + " " + item.getName());
                    }
                }
            } else if (number.equals("2")) {
                id = input.ask("Please enter item ID: ");
                for (Item item : tracker.findAll()) {
                    if (item != null) {
                        if (id.equals(item.getId())) {
                            System.out.println("Item (" + id + ") was found!");
                            name = input.ask("Please enter new item name: ");
                            description = input.ask("Please enter new item description: ");
                            Item newitem = new Item(name, description);
                            newitem.setId(item.getId());
                            tracker.update(newitem);
                        }
                    }
                }
            } else if (number.equals("3")) {
                id = input.ask("Please enter item ID: ");
                for (Item item : tracker.findAll()) {
                    if (item != null) {
                        if (id.equals(item.getId())) {
                            tracker.delete(item);
                        }
                    }
                }
            } else if (number.equals("4")) {
                id = input.ask("Please enter item ID: ");
                for (Item item : tracker.findAll()) {
                    if (item != null) {
                        if (id.equals(item.getId())) {
                            System.out.println(item.getName());
                        }
                    }
                }
            } else if (number.equals("5")) {
                id = input.ask("Please enter item name: ");
                for (Item item : tracker.findAll()) {
                    if (item != null) {
                        if (id.equals(item.getName())) {
                            System.out.println(item.getId());
                        }
                    }
                }
            } else if (number.equals("6")) {
                System.out.println("Bye bye");
                break;
            }
        }
    }

    /**
     *
     * @param args String
     * @throws IOException Exception
     */
    public static void main(String[] args) throws IOException {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
    }
}
