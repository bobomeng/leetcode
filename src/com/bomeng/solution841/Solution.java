package com.bomeng.solution841;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> keys = new ArrayList<>();
        keys.add(1);
        rooms.add(keys);
        keys = new ArrayList<>();
        keys.add(2);
        rooms.add(keys);
        keys = new ArrayList<>();
        keys.add(3);
        rooms.add(keys);
        keys = new ArrayList<>();
        rooms.add(keys);

        System.out.println(s.canVisitAllRooms(rooms));

        rooms = new ArrayList<>();
        keys = new ArrayList<>();
        keys.add(1);
        keys.add(3);
        rooms.add(keys);
        keys = new ArrayList<>();
        keys.add(3);
        keys.add(0);
        keys.add(1);
        rooms.add(keys);
        keys = new ArrayList<>();
        keys.add(2);
        rooms.add(keys);
        keys = new ArrayList<>();
        keys.add(0);
        rooms.add(keys);

        System.out.println(s.canVisitAllRooms(rooms));
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (!queue.isEmpty()) {
           Integer i = queue.poll();
           visited.add(i);
           List<Integer> keys = rooms.get(i);
           for (Integer key: keys) {
               if (!visited.contains(key)) {
                   queue.add(key);
               }
           }
        }
        return visited.size() == rooms.size();
    }
}
