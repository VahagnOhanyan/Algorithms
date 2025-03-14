package org.example.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "accbba";
        System.out.println(repeatedCharacter(s));

    }
}
