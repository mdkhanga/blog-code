package com.mj.leetcode;

import java.util.*;
import java.util.concurrent.Callable;

// Leetcode 1311
public class WatchedVideosFriends {

    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {

        List<String> ret = new ArrayList<>();
        Map<String, Integer> frequencies = new HashMap<>() ;
        boolean[] visited = new boolean[friends.length];
        for (int i = 0 ; i < friends.length; i++) {
            visited[i] = false;
        }

        int l = 0 ;
        Queue<FriendWithLevel> queue = new ArrayDeque() ;
        queue.add(new FriendWithLevel(id, 0));
        visited[id] = true ;

        while( !queue.isEmpty()) {
            FriendWithLevel f = queue.poll() ;
            if (f.level < level) {
                for (int i = 0 ; i < friends[f.id].length ; i++) {
                    if (!visited[friends[f.id][i]]) {
                        queue.add(new FriendWithLevel(friends[f.id][i], f.level + 1));
                        visited[friends[f.id][i]] = true;
                    }
                }
            } else {
                List<String> videos = watchedVideos.get(f.id);
                for(String s: videos) {
                   int newval = frequencies.containsKey(s) ? frequencies.get(s) + 1 :1;
                   frequencies.put(s, newval);
                }
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequencies.entrySet());
        entries.sort(new ValueKeyComparator());

        entries.forEach((e)->{
            ret.add(e.getKey());
        });

        return ret;
    }

    private static class FriendWithLevel {
        int id ;
        int level ;

        public FriendWithLevel(int i , int l) {
            id = i;
            level = l;
        }
    }

    private static class ValueKeyComparator implements Comparator<Map.Entry<String, Integer>> {


        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            int ret = o1.getValue() - o2.getValue();

            if (ret != 0) {
                return ret;
            } else {
                return o1.getKey().compareTo(o2.getKey());
            }

        }
    }
}
