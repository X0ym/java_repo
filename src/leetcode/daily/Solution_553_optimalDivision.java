package leetcode.daily;

class Solution_553_optimalDivision {
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]);
        if (nums.length == 1) return sb.toString();
        sb.append("/");
        if (nums.length == 2) return sb.append(nums[1]).toString();
        sb.append("(");
        for (int i = 1; i < nums.length; i ++) {
            sb.append(nums[i] + "/");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        return sb.toString();
    }
}