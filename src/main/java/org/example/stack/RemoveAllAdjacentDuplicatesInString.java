package org.example.stack;

import java.util.HashMap;
import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                char c2 = stack.peek();
                if (c == c2) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.reverse();
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
