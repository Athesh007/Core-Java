package Map;

import java.util.*;

public class treemap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "Ajith");
        treeMap.put(1, "Vijay");
        treeMap.put(4, "Suriya");
        treeMap.put(2, "Deva");

        System.out.println("Original TreeMap: " + treeMap);

        int key = 2;
        String value = treeMap.get(key);
        System.out.println("Value for key " + key + ": " + value);

        Map.Entry<Integer, String> lowerEntry = treeMap.lowerEntry(key);
        System.out.println("Lower Entry for key " + key + ": " + lowerEntry);

        Map.Entry<Integer, String> higherEntry = treeMap.higherEntry(key);
        System.out.println("Higher Entry for key " + key + ": " + higherEntry);

        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(key);
        System.out.println("Floor Entry for key " + key + ": " + floorEntry);

        Map.Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(key);
        System.out.println("Ceiling Entry for key " + key + ": " + ceilingEntry);
    }
}

