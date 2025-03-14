package org.example.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < word2.length(); i++) {
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }
        Set<Character> set1 = map1.keySet();
        Set<Character> set2 = map2.keySet();

        List<Integer> values1 = map1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> value2 = map2.values().stream().sorted().collect(Collectors.toList());
        return values1.equals(value2) && set1.equals(set2);
    }

    public static void main(String[] args) {
        String word1 = "uau", word2 = "ses";
        System.out.println(closeStrings(word1, word2));
    }
}
