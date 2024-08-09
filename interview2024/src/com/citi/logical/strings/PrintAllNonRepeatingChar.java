package com.citi.logical.strings;

import java.util.Arrays;

public class PrintAllNonRepeatingChar {

    static final int MAX_CHAR = 256;

    public static void main(String[] args) {
        String s = "abbcddeff"; // asher
        //approach1(s, s.length());
        System.out.println();
        approach2(s, s.length());
    }

    /*
    Time Complexity: O(n)
    Auxiliary Space: O(n)
    1. Initialize all values in count[] as 0 and all values in index[] as n where n is length of string.
    2. Traverse the input string str and do following for every character c = str[i].
        Increment count[x].
        If count[x] is 1, then store index of x in index[x], i.e., index[x] = i
        If count[x] is 2, then remove x from index[], i.e., index[x] = n
    3. Now index[] has indexes of all distinct characters. Sort indexes and print characters using it.
       Note that this step takes O(1) time assuming number of characters are fixed (typically 256)
     */
    private static void approach2(String str, int n) {
        int[] count = new int[MAX_CHAR];
        int[] index = new int[MAX_CHAR];

        for (int i = 0; i < MAX_CHAR; i++) {
            count[i] = 0;
            index[i] = n;
        }

        for (int i = 0; i < n; i++) {
            char x = str.charAt(i);
            ++count[x];

            if (count[x] == 1)
                index[x] = i;

            if (count[x] == 2)
                index[x] = n;
        }

        Arrays.sort(index);

        for (int i = 0; i < MAX_CHAR && index[i] != n;i++)
            System.out.print(str.charAt(index[i]));
    }

    /*
    Time Complexity: O(n2)
    Auxiliary Space: O(1)
     */
    private static void approach1(String s, int length) {
        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            if (count[s.charAt(i)] == 1)
                System.out.print(s.charAt(i));
    }
}
