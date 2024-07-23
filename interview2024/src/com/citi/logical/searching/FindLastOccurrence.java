package com.citi.logical.searching;

public class FindLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {10, 10, 15, 15, 15};
        int x = 15;
        System.out.println(x + " 1st occur at index : " + searchFirst(arr, x));
    }

    static int searchFirst(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
}
