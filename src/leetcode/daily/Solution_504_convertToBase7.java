package leetcode.daily;

class Solution_504_convertToBase7 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
        //if (num == 0) return "0";
        //return convertToR(num, 7);
    }

    public static String convertToR (int num, int r) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        if (num < 0) {
            num = -num;
            flag = true;
        }
        //String source = "0123456789ABCDEF";
        while (num > 0) {
            //System.out.println(num % r);
            sb.append(num % r);
            num /= r;
        }
        if (flag) sb.append("-");
        return sb.reverse().toString();
    }
}