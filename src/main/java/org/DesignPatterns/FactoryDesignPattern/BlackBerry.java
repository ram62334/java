package org.DesignPatterns.FactoryDesignPattern;

public class BlackBerry implements OsInterface{
    @Override
    public void specs() {
        System.out.println("Blackberry: most secure and fast");
    }
}
