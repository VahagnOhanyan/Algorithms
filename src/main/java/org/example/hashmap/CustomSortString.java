package org.example.hashmap;

import java.util.*;

public class CustomSortString {

    public static String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            map.put(c, i);
        }
        List<Character> charList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            charList.add(c);
        }
        charList.sort(Comparator.comparingInt(a -> map.getOrDefault(a, Integer.MAX_VALUE)));
        StringBuilder sb = new StringBuilder();
        for (char c : charList) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String order = "cba", s = "abcd";
        System.out.println(customSortString(order, s));
    }
}
