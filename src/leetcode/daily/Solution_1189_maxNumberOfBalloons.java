package leetcode.daily;

class Solution_1189_maxNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int[] alp = new int[26];
        for (char c : text.toCharArray()) {
            alp[c - 'a'] += 1;
        }
        int a = Math.min(Math.min(alp['b' - 'a'], alp[0]), alp['n' - 'a']);
        int b = Math.min(alp['l' - 'a'] / 2 , alp['o' - 'a'] / 2);
        return Math.min(a, b);
    }
}