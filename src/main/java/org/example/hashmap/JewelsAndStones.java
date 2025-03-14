package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
          for (int i = 0; i < jewels.length(); i++) {
              char ch = jewels.charAt(i);
              map.put(ch, map.getOrDefault(ch, 0) + 1);
          }
          for (int i = 0; i < stones.length(); i++) {
              if (map.containsKey(stones.charAt(i))) {
                  count++;
              }
          }
          return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbbb";
        System.out.println(numJewelsInStones(jewels, stones));

    }
}
