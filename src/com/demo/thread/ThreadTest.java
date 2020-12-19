package com.demo.thread;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadTest {

    private final static long countUntil = 100;
    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            long sum = 0;
            for (long i = 1; i < countUntil; i++) {
                sum += i;
            }
            System.out.println(Thread.currentThread().getName() + " - " + sum);
        };
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 500; i++) {
            executor.execute(task);
            System.out.println("Sleep...");
            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        }
        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        // Wait until all threads are finish
        executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Finished all threads");
    }
}
