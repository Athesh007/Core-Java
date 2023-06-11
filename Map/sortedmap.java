package Map;

import java.util.*;

public class sortedmap {

    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.put(3, "Ajith");
        sortedMap.put(1, "Vijay");
        sortedMap.put(4, "Suriya");
        sortedMap.put(2, "Deva");

        System.out.println("Original SortedMap: " + sortedMap);

        int key = 2;
        String value = sortedMap.get(key);
        System.out.println("Value for key " + key + ": " + value);

        SortedMap<Integer, String> headMap = sortedMap.headMap(key);
        System.out.println("Head Map (before key " + key + "): " + headMap);

        SortedMap<Integer, String> tailMap = sortedMap.tailMap(key);
        System.out.println("Tail Map (after key " + key + "): " + tailMap);

        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 4);
        System.out.println("Sub Map (between key 2 and key 4): " + subMap);
    }
}

