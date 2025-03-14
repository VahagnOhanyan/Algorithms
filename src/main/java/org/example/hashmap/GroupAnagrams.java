package org.example.hashmap;

import java.lang.reflect.Array;
import java.util.*;

import static org.example.hashmap.MaximumNumberOfBalloons.maxNumberOfBalloons;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
         for (String str : strs) {
             char[] chars = str.toCharArray();
             Arrays.sort(chars);
             String key = new String(chars);
             map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
         }
         return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
}
