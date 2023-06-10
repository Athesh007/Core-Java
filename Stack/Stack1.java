package Stack;

import java.util.*;

public class Stack1 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Adhi");
        stack.push("Prasath");
        stack.push("Arun");

        System.out.println("Stack: " + stack);

        System.out.println("Popped Element: " + stack.pop());

        System.out.println("Top Element: " + stack.peek());

        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}

