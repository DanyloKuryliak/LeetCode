package com.leetcode.mst;

import java.util.Arrays;

class Solution {
    public int minimumCost(int n, int[][] connections) {
        DisjointSet set = new DisjointSet(n);
        Arrays.sort(connections, (a, b) -> a[2]-b[2]);
        int total = 0;
        int cost = 0;
        for (int i = 0; i < connections.length; i++) {
            int a = connections[i][0];
            int b = connections[i][1];
            if (set.inSameGroup(a, b)) continue;
            set.union(a, b);
            cost += connections[i][2];
            total++;
        }

        if (total == n - 1) {
            return cost;
        } else {
            return -1;
        }
    }
}

class DisjointSet {
    private int[] weights;
    private int[] parents;

    public void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) return;

        if (this.weights[rootA] > this.weights[rootB]) {
            this.parents[rootB] = rootA;
            this.weights[rootB] += this.weights[rootB];
        } else {
            this.parents[rootA] = rootB;
            this.weights[rootB] += this.weights[rootA];
        }
    }

    public int find(int a) {
        while (this.parents[a] != a) {
            this.parents[a] = this.parents[parents[a]];
            a = this.parents[a];
        }
        return a;
    }

    public boolean inSameGroup(int a, int b) {
        return find(a) == find(b);
    }

    public DisjointSet(int N) {
        this.parents = new int[N+1];
        this.weights = new int[N+1];

        for (int i = 1; i <= N; i++) {
            this.parents[i] = i;
            this.weights[i] = 1;
        }
    }
}