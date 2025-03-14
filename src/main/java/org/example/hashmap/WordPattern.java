package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!Objects.equals(map.get(c), words[i])) return false;
            } else {
                if (map.containsValue(words[i])) return false;
            }
            map.put(c, words[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }
}
