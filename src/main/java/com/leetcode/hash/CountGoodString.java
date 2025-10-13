package com.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

public class CountGoodString {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            String sub = s.substring(i, i + 3);
            Set<Character> set = new HashSet<>();

            boolean isGood = true;
            for (char c : sub.toCharArray()) {
                if (!set.add(c)) {
                    isGood = false;
                    break;
                }

            }

            if (isGood) {
                count++;
            }

        }
        return count;
    }
}