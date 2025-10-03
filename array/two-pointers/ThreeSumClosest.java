package array.twopointers;
import java.util.*;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(closestSum - target);
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (Math.abs(sum - target) < minDiff) {
                    closestSum = sum;
                    minDiff = (Math.abs(sum - target));
                }

                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    return sum;
                }
            }
        }
        return closestSum;
    }
}