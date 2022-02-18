package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution_1791_findCenter {
    public int findCenter1(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int n = edges.length;
        for (int i = 0; i < n; i ++) {
            map.put(edges[i][0], map.getOrDefault(edges[i][0], 0) + 1);
            map.put(edges[i][1], map.getOrDefault(edges[i][1], 0) + 1);
            set.add(edges[i][0]);
            set.add(edges[i][1]);
        }
        int num = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == set.size() - 1) {
                num = key;
            }
        }
        return num;
    }

    public int findCenter2(int[][] edges) {
        int n = edges.length;
        int res = edges[0][0];
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) return res;
        else return edges[0][1];
    }
}