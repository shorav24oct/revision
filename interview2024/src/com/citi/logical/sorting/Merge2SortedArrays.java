package com.citi.logical.sorting;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2, 4, 5};
        sort(a, b, a.length, b.length);
    }

    private static void sort(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
        }

        while (i < m) {
            System.out.print(a[i] + " ");
            i++;
        }

        while (j < n) {
            System.out.print(b[j] + " ");
            j++;
        }

    }
}
