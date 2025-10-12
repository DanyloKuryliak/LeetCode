package com.leetcode.array.greedy;
import java.util.*;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        Stack<Character> stack = new Stack<>();
        Set<Character> visited = new HashSet<>();
        for (int  i = 0; i < s.length(); i++) {
            if (visited.contains(s.charAt(i))) {
                continue;
            }

            while (!stack.isEmpty() && s.charAt(i) < stack.peek() && i < map.getOrDefault(stack.peek(), -1)) {
                visited.remove(stack.pop());
            }
            stack.push(s.charAt(i));
            visited.add(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (char c: stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
