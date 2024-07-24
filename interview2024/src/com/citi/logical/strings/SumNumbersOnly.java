package com.citi.logical.strings;

public class SumNumbersOnly {
    public static void main(String[] args) {
        String str = "123abc123";
        System.out.println(sumNoOnly(str));
    }

    private static int sumNoOnly(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }
}
