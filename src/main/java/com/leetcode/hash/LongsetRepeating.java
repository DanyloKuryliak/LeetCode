package com.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class LongsetRepeating {
    public int characterReplacement(String s, int k) {
        int max_count = 0;
        int left = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            max_count = Math.max(max_count, freq.get(c));

            if (r - left + 1 - max_count > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }
        }
        return s.length() - left;
    }
}

