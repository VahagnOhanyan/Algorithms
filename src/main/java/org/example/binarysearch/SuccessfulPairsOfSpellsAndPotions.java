package org.example.binarysearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SuccessfulPairsOfSpellsAndPotions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            for (int potion : potions) {
                int product = spell * potion;
                if (product >= success) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }

            }
        }

        for (int i = 0; i < spells.length; i++) {
            result[i] = map.getOrDefault(i, 0);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        int success = 7;
        var s = new SuccessfulPairsOfSpellsAndPotions();
        System.out.println(Arrays.toString(s.successfulPairs(spells, potions, success)));

    }
}
