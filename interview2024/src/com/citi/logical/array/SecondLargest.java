package com.citi.logical.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {15, 2, 10, 5};
        int largest = firstLargest(a, a.length);
        System.out.println(secondLargest(a, a.length, largest));
    }

    private static int secondLargest(int[] a, int length, int largest) {
        int res = -1;

        for (int i = 0; i < length; i++) {
            if (a[i] != a[largest]) {
                if (res == -1)
                    res = i;
                else if (a[i] > a[res])
                    res = i;
            }
        }
        return res;
    }

    static int firstLargest(int[] a, int n) {
        int res = 0;

        for (int i = 1; i < n; i++)
            if (a[i] > a[res])
                res = i;

        return res;
    }
}
