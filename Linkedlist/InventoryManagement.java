package Linkedlist;

import java.util.*;

class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        LinkedList<Item> inventory = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("=== Inventory Management System ===");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter item price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    Item item = new Item(name, quantity, price);
                    inventory.add(item);
                    System.out.println("Item added successfully!");
                    break;
                case "2":
                    if (!inventory.isEmpty()) {
                        System.out.print("Enter index of item to remove: ");
                        int index = Integer.parseInt(scanner.nextLine());
                        if (index >= 0 && index < inventory.size()) {
                            Item removedItem = inventory.remove(index);
                            System.out.println("Item removed: " + removedItem.getName());
                        } else {
                            System.out.println("Invalid index!");
                        }
                    } else {
                        System.out.println("Inventory is empty!");
                    }
                    break;
                case "3":
                    if (!inventory.isEmpty()) {
                        System.out.println("Inventory List:");
                        for (int i = 0; i < inventory.size(); i++) {
                            Item currentItem = inventory.get(i);
                            System.out.println("Item " + (i + 1) + ":");
                            System.out.println("Name: " + currentItem.getName());
                            System.out.println("Quantity: " + currentItem.getQuantity());
                            System.out.println("Price: rs." + currentItem.getPrice());
                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("Inventory is empty!");
                    }
                    break;
                case "4":
                    System.out.println("Exiting Inventory Management System...");
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }

            System.out.println();
        } while (!command.equals("4"));
    }
}

