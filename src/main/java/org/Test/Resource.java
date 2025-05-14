package org.Test;

class Resource {
    public synchronized void test1() {
        System.out.println("Inside Test1 Method");
        try {
            Thread.sleep(Long.MAX_VALUE);;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static synchronized void test2() {
        System.out.println("Inside Test2 Method");
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

