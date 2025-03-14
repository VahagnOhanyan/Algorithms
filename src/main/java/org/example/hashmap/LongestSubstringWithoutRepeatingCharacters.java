package org.example.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if (!s.matches("[a-zA-Z0-9\\p{Punct}\\s]*")) {
            return 0;
        }
        int max = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left);
            }
            max = Math.max(max, right - left + 1);
            map.put(s.charAt(right), right + 1);

        }
        return max;
    }


    public static void main(String[] args) {
        String s = "tmmzuxt";
        //String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
