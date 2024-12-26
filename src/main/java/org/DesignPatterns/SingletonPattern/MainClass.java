package org.DesignPatterns.SingletonPattern;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(SingletonClass.getInstance());
        System.out.println(SingletonClass.getInstance());
    }
}
