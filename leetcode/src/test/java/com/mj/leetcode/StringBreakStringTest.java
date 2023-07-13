package com.mj.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBreakStringTest {

    StringBreakString s = new StringBreakString();

    @Test
    public void test1() {
        boolean ret = s.checkIfCanBreak("abc", "xya");
        assertEquals(true, ret);

    }

    @Test
    public void test2() {
        boolean ret = s.checkIfCanBreak("xyzbpvmwulmqfrxbqcziudixceytvvwcohmznmfkoetpgdntrndvjihmxragqosaauthigfjergijsyivo",
                                        "zzfrlpndygsmgjzdzadsxarjvyxuecqlszjnqvlyqkadowoljrmkzxvspdummgraiutxxxqgotqnxwjwfo");
        assertEquals(false, ret);

    }

}