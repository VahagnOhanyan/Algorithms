package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
           map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() != s.length()/map.size()) {
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(areOccurrencesEqual(s));

    }
}
