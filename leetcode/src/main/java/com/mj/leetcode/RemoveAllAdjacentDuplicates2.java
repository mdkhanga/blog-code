package com.mj.leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates2 {

    public String removeDuplicates(String s, int k) {

        Stack<Character> stack = new Stack<>();
        int len = s.length();

        int i = 0;
        while (i < len ) {
            char c = s.charAt(i);

            int count = 1 ;
            while (i < len-1 && s.charAt(i+1) == c) {
                count++;
                i++;
            }

            while (!stack.empty() && stack.peek() == c) {
                stack.pop();
                count++;
            }

            count = count % k ;

            if (count < k) {
                while (count >0 ) {
                    stack.push(c);
                    count--;
                }
            }
            i++;
        }

        char[] retArray = new char[stack.size()] ;
        int j = stack.size() - 1;

        while (!stack.empty()) {
            retArray[j] = stack.pop();
            j--;
        }

        return new String(retArray);

    }

}
