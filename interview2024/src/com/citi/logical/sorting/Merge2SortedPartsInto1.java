package com.citi.logical.sorting;

import java.util.Arrays;

public class Merge2SortedPartsInto1 {
    public static void main(String[] args) {
        int[] a = {5, 10, 15, 2, 4};
        int low = 0;
        int high = a.length - 1;
        int mid = (high - low) / 2;
        System.out.println("Array before Sort : " + Arrays.toString(a));
        sort(a, low, mid, high);
        System.out.println("Array after Sort : " + Arrays.toString(a));
    }

    private static void sort(int[] a, int low, int mid, int high) {
        int m = mid - low + 1;
        int n = high - mid;

        int[] left = new int[m];
        int[] right = new int[n];

        System.arraycopy(a, low, left, 0, m);

        for (int i = 0; i < n; i++)
            right[i] = a[mid + i + 1];

        int i = 0, j = 0, k = low;

        while (i < m && j < n) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < n) {
            a[k] = right[j];
            j++;
            k++;
        }

    }
}
