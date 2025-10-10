package com.leetcode.hash;
import java.util.*;

class LongestSubstringAtLeastKChararacters {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) < k) {
                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);
                return Math.max(left, right);
            }
        }
        return n;

    }
}