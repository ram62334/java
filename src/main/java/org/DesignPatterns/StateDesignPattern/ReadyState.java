package org.DesignPatterns.StateDesignPattern;

public class ReadyState implements VendingState{
    @Override
    public void handle() {
        System.out.println("machine is ready");
    }
}
