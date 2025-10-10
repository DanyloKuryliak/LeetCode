package com.leetcode.hash;
import java.util.*;

class MatrixZeros {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m =  matrix[0].length;
        Set<Integer> setr = new HashSet<>();
        Set<Integer> setc = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    setr.add(i);
                    setc.add(j);
                }
            }
        }
        for (int i : setr) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int j : setc) {
            for (int i = 0; i < n; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}