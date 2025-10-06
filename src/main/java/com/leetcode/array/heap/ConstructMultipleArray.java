package com.leetcode.array.heap;
import java.util.*;

class Solution {
    public boolean isPossible(int[] target) {
        if (target.length == 1) return target[0] == 1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        
        for (int num : target) {
            pq.offer(num);
            sum += num;
        }
        
        while (pq.peek() > 1) {
            int max = pq.poll();
            long rest = sum - max;
            
            if (rest >= max || rest < 1) return false;
            
            int newVal = (int)(max % rest);
            if (newVal == 0) newVal = (int)rest;
            
            pq.offer(newVal);
            sum = rest + newVal;
        }
        
        return true;
    }
}