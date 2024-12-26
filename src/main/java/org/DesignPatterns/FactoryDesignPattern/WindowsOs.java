package org.DesignPatterns.FactoryDesignPattern;

public class WindowsOs implements OsInterface{
    @Override
    public void specs(){
        System.out.println("Windows: used by most");
    }
}
