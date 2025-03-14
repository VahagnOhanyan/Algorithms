package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {
        String t = "balloon";
        int min = text.length()/t.length();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map2);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(map2.containsKey(entry.getKey())) {
                int count = map2.get(entry.getKey()) / entry.getValue();
                min = Math.min(min, count);
            }else{
                return 0;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));

    }
}


