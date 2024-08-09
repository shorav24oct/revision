package com.citi.logical.strings;

/*
Input: geeksforgeeks
Output: f

Input: abcdabcde
Output: e

Input: aabb
Output: -1
 */

import java.util.Arrays;

public class LeftMostNonRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int i = firstNonRepeating(str, str.length());
        int index = fNonRepeat(str, str.length());

        if (index == -1)
            System.out.println("All characters are repeating");
        else
            System.out.println("First Non Repeating character is " + str.charAt(index));

    }

    /*
    Time Complexity: O(n2)
    Auxiliary Space: O(1)
     */
    private static int firstNonRepeating(String str, int length) {

        int[] COUNT = new int[256];

        for (int i = 0; i < length; i++)
            COUNT[str.charAt(i)]++;

        for (int i = 0; i < length; i++)
            if (COUNT[str.charAt(i)] == 1)
                return i;

        return -1;
    }

    private static int fNonRepeat(String s, int n) {
        int[] fIndex = new int[256];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (fIndex[s.charAt(i)] == -1)
                fIndex[s.charAt(i)] = i;
            else
                fIndex[s.charAt(i)] = -2;
        }

        for (int i = 0; i < 256; i++)
            if (fIndex[i] >= 0)
                res = Math.min(res, fIndex[i]);


        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}
