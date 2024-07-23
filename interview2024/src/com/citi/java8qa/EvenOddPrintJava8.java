package com.citi.java8qa;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrintJava8 {

    private static final Object object = new Object();

    private static final IntPredicate evenCond = e -> e % 2 == 0;
    private static final IntPredicate oddCond = e -> e % 2 != 0;

    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.runAsync(() -> EvenOddPrintJava8.printNumber(oddCond));
        CompletableFuture.runAsync(() -> EvenOddPrintJava8.printNumber(evenCond));
        Thread.sleep(1000);
    }

    public static void execute(int no) {
        synchronized (object) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + no);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printNumber(IntPredicate condition) {
        IntStream.rangeClosed(1,10).filter(condition).forEach(EvenOddPrintJava8::execute);
    }
}
