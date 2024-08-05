package com.citi.logical.strings;

/*
Input: geeksforgeeks
Output: g

Input: abcdabcd
Output: a

Input: abcd
Output: -1
 */

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int index = firstRepeating(str, str.length());

        if (index == -1)
            System.out.println("Either all characters are distinct or string is empty");
        else
            System.out.println("First Repeating character is " + str.charAt(index));

    }

    private static int firstRepeating(String str, int length) {

        int[] COUNT = new int[256];

        for (int i = 0; i < length; i++)
            COUNT[str.charAt(i)]++;

        for (int i = 0; i < length; i++)
            if (COUNT[str.charAt(i)] > 1)
                return i;

        return 0;
    }
}
