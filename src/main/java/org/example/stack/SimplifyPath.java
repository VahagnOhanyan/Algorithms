package org.example.stack;

import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        StringBuilder pathBuilder = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        for (String value : split) {
            if (value.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!value.equals(".") && !value.isEmpty()) {
                stack.push(value);
            }
        }

        for (String s : stack) {
            pathBuilder.append("/").append(s);
        }
        path = pathBuilder.toString();

        return path.isEmpty() ? "/" : path;
    }

    public static void main(String[] args) {
        String path = "/../";
        System.out.println(simplifyPath(path));
    }
}
