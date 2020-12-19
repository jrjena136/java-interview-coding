package com.demo.designpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DesignPatternTest {
    public static void main(String[] args) throws InterruptedException {
        SingletonDesignPattern sp = SingletonDesignPattern.getInstance();
        System.out.println(sp.hashCode());
        SingletonDesignPattern sp1 = SingletonDesignPattern.getInstance();
        System.out.println(sp1.hashCode());
        System.out.println(sp.hashCode() == sp1.hashCode());
        Runnable task = () -> {
            SingletonDesignPattern sp2 = SingletonDesignPattern.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + sp2.hashCode());
        };

        /*for(int i = 0; i < 10;) {
            task.run();
            i++;
        }*/

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(task);
        Thread.sleep(2000);
    }
}
