package Array_list;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("pineapple");

        System.out.println("Fruits: " + fruits);

        int size = fruits.size();
        System.out.println("Size: " + size);

        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        fruits.set(1, "Grapes");
        System.out.println("Modified fruits: " + fruits);

        fruits.remove(2);
        System.out.println("Updated fruits: " + fruits);

        boolean containsMango = fruits.contains("Mango");
        System.out.println("Contains Mango: " + containsMango);

        fruits.clear();
        System.out.println("Cleared fruits: " + fruits);

        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is empty: " + isEmpty);
    }
}

