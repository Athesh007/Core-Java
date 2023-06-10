package Linkedlist;

import java.util.*;

public class Linkedlist1 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("LinkedList: " + linkedList);

        linkedList.add(1, "Grapes");
        linkedList.addFirst("Mango");
        linkedList.addLast("Pineapple");

        System.out.println("Modified LinkedList: " + linkedList);
    }
}

