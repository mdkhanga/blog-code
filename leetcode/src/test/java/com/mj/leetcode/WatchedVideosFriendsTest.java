package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WatchedVideosFriendsTest {

    WatchedVideosFriends wf = new WatchedVideosFriends();

    @Test
    public void test1() {
        List<List<String>> watchVideos = Arrays.asList(Arrays.asList("A","B"),
                                                        Arrays.asList("C"),Arrays.asList("B","C"),
                                                                Arrays.asList("D"));

        int[][] friends = {{1,2},{0,3},{0,3},{1,2}};

        List ret = wf.watchedVideosByFriends(watchVideos, friends, 0, 2) ;

        System.out.println(ret);

    }

}