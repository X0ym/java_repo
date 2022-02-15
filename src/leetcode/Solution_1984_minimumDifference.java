package leetcode;

import java.util.Arrays;

public class Solution_1984_minimumDifference {
    public int minimumDifference(int[] nums, int k) {
        // sort + slide window
        Arrays.sort(nums);

        if (k >= nums.length) return nums[nums.length - 1] - nums[0];
        int i = 0, j = k - 1;
        int min = Integer.MAX_VALUE;
        while (j < nums.length) {
            min = Math.min(min, nums[j] - nums[i]);
            j ++; i ++;
        }
        return min;
    }
}
