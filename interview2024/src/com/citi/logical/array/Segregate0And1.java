package com.citi.logical.array;

import java.util.Arrays;

public class Segregate0And1 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1};
        System.out.println("Before Segregate : " + Arrays.toString(arr));
        method2(arr, arr.length);
        System.out.println("After Segregate : " + Arrays.toString(arr));
    }

    /*
    count 0's and 1's
     */
    static void method1(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] == 0)
                count++;

        // loop to fill the arr with 0 until count
        for (int i = 0; i < count; i++)
            arr[i] = 0;

        // loop to fill the remaining arr with 1
        for (int i = count; i < n; i++)
            arr[i] = 1;
    }

    /*

     */
    static void method2(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {

            while (arr[left] == 0 && left < right)
                left++;

            while (arr[right] == 1 && left < right)
                right--;

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

}
