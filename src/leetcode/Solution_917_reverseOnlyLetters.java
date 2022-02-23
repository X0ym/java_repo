package leetcode;

class Solution_917_reverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;
        while (i < j) {
            while (i < j && !Character.isLetter(ch[i])) i ++;
            while (i < j && !Character.isLetter(ch[j])) j --;
            if (i < j) {
                char tmp = ch[i];
                ch[i] = ch[j];
                ch[j] = tmp;
                i++;j --;
            } else {
                break;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String res = new Solution_917_reverseOnlyLetters().reverseOnlyLetters(s);
        System.out.println(res);
    }
}