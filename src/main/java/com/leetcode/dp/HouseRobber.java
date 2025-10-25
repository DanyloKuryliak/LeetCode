package com.leetcode.dp;

import java.util.HashMap;

public class HouseRobber {
    private HashMap<Integer, Integer> memo = new HashMap<>();
    private int[] nums;

    public int rob(int[] nums) {
        this.nums = nums;
        return dp(nums.length - 1);
    }

    private int dp(int i) {
        if (i==0) return nums[0];
        if (i==1) return Math.max(nums[0], nums[1]);
        if (!memo.containsKey(i)) {
            memo.put(i, Math.max(dp(i-2) + nums[i], dp(i-1)));
        }
        return memo.get(i);
    }

}

class Solution1 {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length + 1];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[nums.length-1];
    }
}