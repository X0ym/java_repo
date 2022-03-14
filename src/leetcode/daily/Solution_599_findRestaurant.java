package leetcode.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution_599_findRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i ++) {
            map1.put(list1[i], i);
        }

        List<String> index = new ArrayList<>();
        int indexMin = 1998;// 被自己坑了，索引和的最小值应该是两个list长度和 - 2
        for (int j = 0;j < list2.length; j ++) {
            if (map1.containsKey(list2[j])) {
                int indexSum = j + map1.get(list2[j]);
                if (indexSum < indexMin) {
                    index.clear();
                    index.add(list2[j]);
                    indexMin = indexSum;
                } else if (indexSum == indexMin) {
                    index.add(list2[j]);
                }
            }
        }
        return index.toArray(new String[index.size()]);
    }
}