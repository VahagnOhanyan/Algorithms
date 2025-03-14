package org.example.hashmap;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {
    public static boolean checkIfPangram(String sentence) {
       /* Set<Character> s = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            s.add(sentence.charAt(i));
        }
        return s.size() == 26;*/
        int seen = 0;

        // Iterate over 'sentence'.
        for (char currChar : sentence.toCharArray()) {
            // Map each 'currChar' to its index using its ASCII code.
            int mappedIndex = currChar - 'a';

            // 'currBit' represents the bit for 'currChar'.
            int currBit = 1 << mappedIndex;

            // Use 'OR' operation since we only add its bit for once.
            seen |= currBit;
        }

        // Once we finish iterating, check if 'seen' contains 26 bits of 1.
        return seen == (1 << 26) - 1;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

    }
}
