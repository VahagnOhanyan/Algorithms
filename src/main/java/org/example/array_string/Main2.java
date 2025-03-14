package org.example.array_string;

public class Main2 {

    public static String reverseOnlyLetters(String s) {
        char temp;
        StringBuilder sb = new StringBuilder(s);
        String onlyLetters = s.replaceAll("[^a-zA-Z]", "");
        if (!onlyLetters.isEmpty()) {
            int left = 0;
            int right = sb.length() - 1;
            while (right - left > 0) {
                if (Character.isLetter(sb.charAt(right)) && Character.isLetter(sb.charAt(left))) {
                    temp = sb.charAt(right);
                    sb.setCharAt(right, sb.charAt(left));
                    sb.setCharAt(left, temp);
                    left++;
                    right--;
                } else {
                    if (!Character.isLetter(sb.charAt(right))) {
                        right--;
                    }
                    if (!Character.isLetter(sb.charAt(left))) {
                        left++;
                    }
                }
            }
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        String n = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(n));

    }
}
