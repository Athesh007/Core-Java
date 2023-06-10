package TreeSet;

import java.util.*;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        
        System.out.println("TreeSet: " + numbers);

        int searchElement = 10;
        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is found in the TreeSet.");
        } else {
            System.out.println(searchElement + " is not found in the TreeSet.");
        }
        int removeElement = 3;
        if (numbers.remove(removeElement)) {
            System.out.println(removeElement + " is removed from the TreeSet.");
        } else {
            System.out.println(removeElement + " is not found in the TreeSet.");
        }

        System.out.println("TreeSet after removal: " + numbers);

        System.out.println("Iterating over the TreeSet:");
        for (int number : numbers) {
            System.out.println(number);
        }
        numbers.clear();
        if (numbers.isEmpty()) {
            System.out.println("TreeSet is empty.");
        } else {
            System.out.println("TreeSet is not empty.");
        }
    }
}

