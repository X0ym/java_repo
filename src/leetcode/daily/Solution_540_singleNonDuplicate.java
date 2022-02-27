package leetcode.daily;

class Solution_540_singleNonDuplicate {
    // O(N)
    public int singleNonDuplicate1(int[] nums) {
        if (nums.length < 2) return nums[0];
        int i = 0, j = 1;
        while (nums[i] == nums[j] && j < nums.length) {
            i += 2; j = i + 1;
        }
        return nums[i];
    }

    // O(logN)
    public int singleNonDuplicate(int[] nums) {
        int i = 0, j = nums.length - 1;
        int mid = -1;
        while (i < j) {
            mid  = i + (j - i) / 2;
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    i = mid + 2;
                } else {
                    j = mid;
                }
            } else {
                // mid odd
                if (nums[mid] == nums[mid - 1]) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
        }
        return nums[i];
    }
}