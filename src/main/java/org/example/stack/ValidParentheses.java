package org.example.stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (getPair(c) == '?') {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != getPair(c)) {
                return false;
            }

        }
        return stack.isEmpty();
    }

    private static Character getPair(char c) {
        if (c == ')') return '(';
        if (c == '}') return '{';
        if (c == ']') return '[';
        return '?';

    }

    public static void main(String[] args) {
        String s = "{()}()";
        System.out.println(isValid(s));
    }
}
