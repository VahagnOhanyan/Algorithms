package org.example.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindLongestSubstringClass {
    public static int findLongestSubstring(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            count++;
            if (map.size() == k) {
                max = Math.max(max, count);
                count = count - map.get(s.charAt(left));
                left++;

            }

        }
        return max;
    }

    public static void main(String[] args) {
        int k = 2;
        String s = "eeeeeceba";
        System.out.println(findLongestSubstring(s, k));

    }

}
