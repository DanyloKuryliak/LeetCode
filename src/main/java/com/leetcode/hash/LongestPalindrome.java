package  com.leetcode.hash;
import java.util.*;
public class  LongestPalindrome {
    public int longestPalindrome(String s) {
        int oddfreq = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) % 2 == 1) {
                oddfreq++;
            } else {
                oddfreq--;
            }
        }

        if (oddfreq > 0) {
            return s.length() - oddfreq + 1;
        } else {
            return s.length();
        }
    }
}