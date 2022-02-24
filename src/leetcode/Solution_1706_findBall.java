package leetcode;

import java.util.Arrays;

class Solution_1706_findBall {
    public int[] findBall(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        for (int i = 0; i < n; i++) {
            int cul = i;
            for (int j = 0; j < m; j ++) {
                if (grid[j][cul] == 1) {
                    if (cul < n - 1 && grid[j][cul + 1] == 1) cul ++;
                    else break;
                } else {
                    if (cul > 0 && grid[j][cul - 1] == -1) cul --;
                    else break;
                }
                if (j == m - 1) res[i] = cul;
            }
        }
        return res;
    }
}