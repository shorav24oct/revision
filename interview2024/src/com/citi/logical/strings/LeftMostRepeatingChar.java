package com.citi.logical.strings;

/*
Input: geeksforgeeks
Output: g

Input: abcdabcd
Output: a

Input: abcd
Output: -1
 */

import java.util.Arrays;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        String str = "abcdd";
        int index1 = firstRepeating(str, str.length());
        int index = fRepeat(str, str.length());

        if (index1 == -1)
            System.out.println("Either all characters are distinct or string is empty");
        else
            System.out.println("First Repeating character is " + str.charAt(index));

    }

    /*
    Time Complexity: O(n2)
    Auxiliary Space: O(1)
     */
    private static int firstRepeating(String str, int length) {

        int[] COUNT = new int[256];

        for (int i = 0; i < length; i++)
            COUNT[str.charAt(i)]++;

        for (int i = 0; i < length; i++)
            if (COUNT[str.charAt(i)] > 1)
                return i;

        return -1;
    }

    /*
    Time Complexity: O(n)
    Auxiliary Space: O(1)
     */
    private static int fRepeat(String s, int n) {
        int[] fIndex = new int[256];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (fIndex[s.charAt(i)] == -1)
                fIndex[s.charAt(i)] = i;
            else
                res = Math.min(res, fIndex[s.charAt(i)]);
        }

        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}
