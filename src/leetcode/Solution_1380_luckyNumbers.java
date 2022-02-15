package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution_1380_luckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] a = new int[m]; // 行最小值的列下标，a的下标代表了行
        int[] b = new int[n]; // 列最大值的行下标, b的下标代表了列

        List<Integer> res = new ArrayList<>();
        for (int i = 0;i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (matrix[i][j] < matrix[i][a[i]]) a[i] = j;
                if (matrix[i][j] > matrix[b[j]][j]) b[j] = i;
            }
        }

        for (int i = 0; i < m; i ++) {
            if(i == b[a[i]]) {
                res.add(matrix[i][a[i]]);
            }
        }
        return res;
    }
}