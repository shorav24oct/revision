package com.citi.logical.array;

import java.util.ArrayList;

class divideArrayInChunks {

    // Function to split the array
    static ArrayList<ArrayList<Integer>> divideArray(int[] arr, int chunkSize, int arrSize) {

        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arrSize; i++) {
            temp.add(arr[i]);
            if (((i + 1) % chunkSize) == 0) {
                ans.add(temp);
                temp = new ArrayList<>();
            }
        }

        // If last group doesn't have enough elements then add 0 to it
        if (!temp.isEmpty()) {
            int a = temp.size();
            while (a != chunkSize) {
                temp.add(0);
                a++;
            }
            ans.add(temp);
        }
        return ans;
    }

    // Function to print answer
    static void printArray(ArrayList<ArrayList<Integer>> a) {
        for (ArrayList<Integer> integers : a) {
            System.out.print("[ ");
            for (Integer integer : integers) System.out.print(integer + " ");
            System.out.print("]");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int chunkSize = 2;
        ArrayList<ArrayList<Integer>> ans = divideArray(arr, chunkSize, arr.length);
        //printArray(ans);
        new ArrayList<>(ans).forEach(System.out::print);
    }
}
