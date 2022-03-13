package leetcode.daily;

class Solution_393_validUtf8 {
    public boolean validUtf8(int[] data) {
        int i = data.length, j = 0;
        while (j < i) {
            int num = data[j];
            String str = getBinary(num);
            int len = 0;
            for (int k = 0;k < 5; k ++) {
                if (str.charAt(k) == '0') {
                    if (k == 1) return false;
                    break;
                }
                else {
                    len ++;
                }
                if (len == 5) return false;
            }

            if (len == 0) {
                j += 1;
                continue;
            }

            //
            if (j + len > data.length) return false;

            for (int l = 1; l < len; l ++) {
                boolean b = validatePrefix(getBinary(data[j + l]), "10");
                if (!b) return false;
            }
            j += len;
        }
        return true;
    }

    /**
     *  判断一个字节的前缀是否符合规范
     */
    public static boolean validatePrefix(String str, String prefix) {
        return str.startsWith(prefix);
    }

    public static String getBinary(int num) {
        String str = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        if (str.length() != 8) {
            for (int i = 0; i < 8 - str.length(); i ++) sb.append(0);
        }
        sb.append(str);
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] data = {145};
        boolean b = new Solution_393_validUtf8().validUtf8(data);
        System.out.println(b);
    }
}