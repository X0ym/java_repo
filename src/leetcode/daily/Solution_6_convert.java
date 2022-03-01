package leetcode.daily;

/**
 *  https://leetcode-cn.com/problems/zigzag-conversion/
 *  z 字形变换
 */
class Solution_6_convert {
    public String convert(String s, int numRows) {
        int period  = 2 * (numRows - 1);
        if (period == 0) return s;

        StringBuilder[] rowsData = new StringBuilder[numRows];
        for (int i = 0;i < numRows; i ++) {
            rowsData[i] = new StringBuilder();
        }

        for (int i = 0;i < s.length(); i += period) {
            for (int j = 0; j < period && i + j < s.length(); j ++) {
                int index = i + j;
                int row = -1;
                if (j / numRows == 0) {
                    row = j % numRows;
                } else {
                    row = numRows - (j % numRows) - 2;
                }
                System.out.println("row:" + row);
                rowsData[row].append(s.charAt(index));
            }
        }
        for (int i = 1; i < numRows; i ++) {
            rowsData[0].append(rowsData[i].toString());
        }
        return rowsData[0].toString();
    }
}