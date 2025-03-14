package org.example.stack;

import java.util.Stack;

public class MakeTheStringGreat {
    public static String makeGood(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String letter = s.substring(i, i + 1);
            if (!stack.isEmpty()) {
                if (stack.peek().equalsIgnoreCase(letter) && !stack.peek().equals(letter)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(letter);

        }
        StringBuilder sBuilder = new StringBuilder();
        for (String string : stack) {
            sBuilder.append(string);
        }
        s = sBuilder.toString();
        return s;
    }

    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
}
