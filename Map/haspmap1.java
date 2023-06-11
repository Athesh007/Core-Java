package Map;

import java.util.*;

public class haspmap1 {
    public static void cwf(String[] words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        
        for(String word : words) {
            if(wordCounts.containsKey(word)) {
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        
        cwf(words);
    }
}