package org.example.hashmap;

import java.util.*;

public class MinimumConsecutiveCardsToPickUp {
    public static int minimumCardPickup(int[] cards) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int min = cards.length;
        for (int i = 0; i < cards.length; i++) {
            if(!map.containsKey(cards[i])) {
                map.put(cards[i], new ArrayList<>());
            }
              map.get(cards[i]).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                List<Integer> list = entry.getValue();
               for (int i = 0; i < list.size()-1; i++) {
                   min = Math.min(min, list.get(i + 1) - list.get(i) + 1);
               }

            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] cards = {3,4,2,3,4,7};
        System.out.println(minimumCardPickup(cards));

    }
}
