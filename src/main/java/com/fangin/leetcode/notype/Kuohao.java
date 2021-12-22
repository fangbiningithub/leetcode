package com.fangin.leetcode.notype;

import java.util.Stack;

public class Kuohao {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (isLeft(c)) {
                st.push(c);
            } else {
                if (st.empty()) {
                    return false;
                }
                if (!isPair(st.pop(), c)) {
                    return false;
                }
            }
        }
        return st.empty();
    }


    boolean isLeft(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    boolean isPair(char left, char right) {
        return (left == '(') && (right == ')')
                || (left == '[') && (right == ']')
                || (left == '{') && (right == '}');

    }
}
