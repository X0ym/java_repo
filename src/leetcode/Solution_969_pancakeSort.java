package leetcode;

import java.util.*;

class Solution_969_pancakeSort {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new ArrayList<>();

        int index = 0;
        for (int i = arr.length; i > 1; i --) {

            for (int j = 0; j < arr.length; j ++) {
                if (arr[j] == i) {
                    index = j;
                    break;
                }
            }
            reverse(arr, 0, index);
            res.add(index + 1);
            //System.out.println(Arrays.toString(arr));
            reverse(arr, 0, i - 1);
            //System.out.println(Arrays.toString(arr));
            res.add(i);
        }
        return res;
    }

    public static void reverse(int[] nums, int i, int j) {
        int tmp = 0;
        while (i < j) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
            i ++; j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,1,6,5};
        List<Integer> sort = new Solution_969_pancakeSort().pancakeSort(arr);
        System.out.println(sort.toString());
    }
}