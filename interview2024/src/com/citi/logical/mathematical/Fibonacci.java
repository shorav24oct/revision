package com.citi.logical.mathematical;

public class Fibonacci {
    public static void main(String[] args) {
        int no = 5;

        System.out.println(fib1(no));
        System.out.println(fib2(no));
    }

    private static int fib1(int no) {
        int a = 0, b = 1, c = 0;

        if (no == 0)
            return 0;

        else if (no == 1)
            return 1;

        else {
            for (int i = 2; i <= no; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return c;
    }

    private static int fib2(int no) {
        return 0;
    }
}
