package org.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
    public static void main(String[] args) {
        Resource resource =  new Resource();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Thread t1 = new Thread(new Task1(resource));
        Thread t2 = new Thread(new Task2(resource));
        t1.start();
        t2.start();
    }
}