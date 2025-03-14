package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomNoteMap.put(ransomNote.charAt(i), ransomNoteMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()) {
            if (entry.getValue() > magazineMap.getOrDefault(entry.getKey(), 0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aaf";
        String magazine = "aabf";
        System.out.println(canConstruct(ransomNote, magazine));

    }
}
