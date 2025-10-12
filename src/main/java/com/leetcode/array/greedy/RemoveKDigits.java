package com.leetcode.array.greedy;
import java.util.*;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (k == 0) {
            return num;
        }
        if (num.length() == k) {
            return "0";
        }
        List<Character> list = new ArrayList<>();
        for (char c: num.toCharArray()) {
            while (k > 0 && !list.isEmpty() && list.getLast() > c) {
                list.removeLast();
                k--;
            }
            list.add(c);
        }

        for (int i = 0; i < k; i++) {
            list.removeLast();
        }

        StringBuilder sb = new StringBuilder();
        for (Character c: list) {
            sb.append(c);
        }
        String result = sb.toString().replaceFirst("^0+", "");
        return result.isEmpty() ? "0" : result;
    }
}
