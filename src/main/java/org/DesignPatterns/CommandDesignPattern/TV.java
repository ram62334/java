package org.DesignPatterns.CommandDesignPattern;

public class TV implements  Device{
    @Override
    public void turnOn() {
        System.out.println("turn on tv");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off tv");
    }
}
