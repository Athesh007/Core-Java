package Array_list;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.add(1, 15);
        numbers.add(3, 25);

        System.out.println("Numbers: " + numbers);
    }
}

