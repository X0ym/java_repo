package leetcode.daily;

/**
 * 链接：
 * https://leetcode-cn.com/problems/count-number-of-maximum-bitwise-or-subsets/solution/tong-ji-an-wei-huo-neng-de-dao-zui-da-zh-r6zd/
 */
class Solution_2044_countMaxOrSubsets {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0, cnt = 0;
        for (int i = 0; i < 1 << nums.length; i++) {
            int orVal = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1) {
                    orVal |= nums[j];
                }
            }
            if (orVal > maxOr) {
                maxOr = orVal;
                cnt = 1;
            } else if (orVal == maxOr) {
                cnt++;
            }
        }
        return cnt;
    }
}