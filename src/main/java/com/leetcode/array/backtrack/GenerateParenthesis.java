package com.leetcode.array.backtrack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(0, 0, "", n, result);
        return result;
    }

    private void dfs(int open, int close, String s, int n, List<String> res) {
        if (open == close && (open + close) == n * 2) {
            res.add(s);
        }
        if (open < n) {
            dfs(open + 1, close, s + "(", n, res);
        }
        if (close < open) {
            dfs(open, close + 1, s + ")", n, res);
        }
    }
}