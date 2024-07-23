package com.citi.logical.array;

public class PairFound {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 11;
        test(arr, x);
    }

    static void test(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] + arr[high] == x) {
                System.out.println("Pair is found at (" + arr[low] + "," + arr[high] + ")");
                low++;
                high--;
            }
            if (arr[low] + arr[high] > x)
                high--;
            if (arr[low] + arr[high] < x)
                low++;
        }
    }

}
