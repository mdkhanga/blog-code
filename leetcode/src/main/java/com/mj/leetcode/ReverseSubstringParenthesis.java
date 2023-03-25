package com.mj.leetcode;

import java.util.Stack;

// Leetcode 1190
public class ReverseSubstringParenthesis {

    public String reverseParentheses(String s) {

        Stack<Integer> mainStack = new Stack<>();
        char[] cArray = new char[s.length()];

        int index = 0;
        int b_removed = 0;
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i) ;
            if ( c == '(') {
                // mainStack.push(i);
                mainStack.push(i-b_removed);
            } else if (c == ')') {
                int start = mainStack.pop();
                int si = mainStack.size();
                reverse(cArray,start-si,i-si-2-b_removed);
                b_removed = b_removed+2;
            } else {
                cArray[index] = c;
                index++;
            }
        }

        return new String(cArray,0,index);

    }

    private void reverse(char[] arr, int start, int end) {

        while(start <= end) {

            char tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }

    }

}
