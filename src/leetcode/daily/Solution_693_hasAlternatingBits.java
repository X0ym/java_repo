package leetcode.daily;

class Solution_693_hasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        if (str.length() == 1) return true;
        for (int i = 0;i < str.length() && i + 1 < str.length(); i ++) {
            if (((str.charAt(i) - '0') ^ (str.charAt(i + 1) - '0')) == 0) return false;

        }
        return true;
    }
}