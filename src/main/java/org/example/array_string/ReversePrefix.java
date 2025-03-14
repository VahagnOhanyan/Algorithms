package org.example.array_string;

public class ReversePrefix {

    public static String reversePrefix(String word, char ch) {
        int left = 0;
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                if (i == 0) {
                    return word;
                } else {
                    int right = i;
                    while (right - left > 0) {
                        sb.setCharAt(right, word.charAt(left));
                        sb.setCharAt(left, word.charAt(right));
                        right--;
                        left++;
                    }
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));

    }
}
