package Linkedlist;

import java.util.*;

public class Linkedlist2 {
    public static void main(String[] args) {

        LinkedList<Double> linkedList = new LinkedList<>();

        linkedList.add(3.14);
        linkedList.add(2.718);
        linkedList.add(1.618);

        System.out.println("LinkedList: " + linkedList);

        double firstNumber = linkedList.get(0);
        double secondNumber = linkedList.get(1);

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        linkedList.set(2, 0.577);

        System.out.println("Modified LinkedList: " + linkedList);

        linkedList.remove(1);

        System.out.println("Modified LinkedList after removal: " + linkedList);

        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);

        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);

        System.out.print("Iterating over the LinkedList: ");
        for (double number : linkedList) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

