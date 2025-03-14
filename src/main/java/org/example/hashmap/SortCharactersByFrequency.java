package org.example.hashmap;

import java.util.*;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character> characterList = new ArrayList<>(map.keySet());
        characterList.sort((a, b) -> map.get(b) - map.get(a));
        for (char character : characterList) {
            sb.append(String.valueOf(character).repeat(Math.max(0, map.get(character))));
        }

        return sb.toString();
    }

    public static void main(String[] args) {


        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
