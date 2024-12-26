package org.DesignPatterns.ProxyDesignPattern;

public class Client {
    public static void main(String[] args) {
        ProxyClass pc = new ProxyClass("rgh");
        pc.showAccountNum();
    }
}
