package com.mj.leetcode;

import java.util.*;

// Leetcode 1311
public class WatchedVideosFriends {

    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {

        List<String> ret = new ArrayList<>();
        Map<String, Integer> frequencies = new HashMap<>() ;
        int l = 0 ;
        Queue<FriendWithLevel> queue = new ArrayDeque() ;
        queue.add(new FriendWithLevel(id, 0));

        while( !queue.isEmpty()) {
            FriendWithLevel f = queue.poll() ;
            if (f.level < level) {
                for (int i = 0 ; i < friends[f.id].length ; i++) {
                    queue.add(new FriendWithLevel(friends[f.id][i],f.level+1));
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
        entries.sort(Map.Entry.comparingByValue());

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
}
