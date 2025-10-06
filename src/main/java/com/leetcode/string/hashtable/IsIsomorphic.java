package com.leetcode.string.hashtable;
import java.util.*;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> hss = new HashMap<>();
        Map<Character, Integer> hst = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!hss.containsKey(s.charAt(i))) {
                hss.put(s.charAt(i), i);
            }
            if (!hst.containsKey(t.charAt(i))) {
                hst.put(t.charAt(i), i);
            }
            if (!hss.get(s.charAt(i)).equals(hst.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}