package org.DesignPatterns.CommandDesignPattern;

public class Sterio implements Device{
    @Override
    public void turnOn() {
        System.out.println("turn on sterio");
    }

    @Override
    public void turnOff() {
        System.out.println("turn of sterio");
    }
}
