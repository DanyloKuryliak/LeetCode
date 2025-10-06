package com.leetcode.string.backtracking;
import java.util.*;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0 ) {
            return res;
        }
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;

    }


    private void backtrack(String digits, int index, StringBuilder combination, List<String> res, Map<Character, String> digitsToLetters) {
        if (index == digits.length()) {
            res.add(combination.toString());
            return;
        }

        String letters = digitsToLetters.get(digits.charAt(index));
        for (char c : letters.toCharArray()) {
            combination.append(c);
            backtrack(digits, index + 1, combination, res, digitsToLetters);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}