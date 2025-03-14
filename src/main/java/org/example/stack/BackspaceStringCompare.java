package org.example.stack;

import java.util.Stack;

public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        String str = fillStack(s, stack);
        stack.clear();
        String str2 = fillStack(t, stack);
        return str.equals(str2);
    }

    private static String fillStack(String text, Stack<Character> stack) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '#') {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(text.charAt(i));
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        String s = "ad#c", t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
}
