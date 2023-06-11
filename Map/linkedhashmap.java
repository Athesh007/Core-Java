package Map;

import java.util.*;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        
        accessOrderMap.put("apple", 10);
        accessOrderMap.put("banana", 20);
        accessOrderMap.put("cherry", 30);
        
        System.out.println("Original Map: " + accessOrderMap);
        
        accessOrderMap.get("apple"); // Accessing "apple"
        
        System.out.println("Map after accessing 'apple': " + accessOrderMap);
        
        accessOrderMap.get("banana"); // Accessing "banana"
        
        System.out.println("Map after accessing 'banana': " + accessOrderMap);
        
        accessOrderMap.put("durian", 40);
        
        System.out.println("Map after adding 'durian': " + accessOrderMap);
    }
}
