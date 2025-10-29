package com.leetcode.dp;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
    Map<Integer, Integer> memo = new HashMap<>();
    public int numDecodings(String s) {
        return dp(0, s);
    }

    private int dp(int index, String str) {
        if (memo.containsKey(index)) return memo.get(index);

        if (index == str.length()) return 1;

        if (str.charAt(index) == '0') {
            return 0;
        }

        if (index == str.length() - 1) return 1;

        int ans = dp(index + 1, str);
        if (Integer.parseInt(str.substring(index, index + 2)) <= 26) {
            ans += dp(index + 2, str);
        }

        memo.put(index, ans);
        return ans;
    }
}