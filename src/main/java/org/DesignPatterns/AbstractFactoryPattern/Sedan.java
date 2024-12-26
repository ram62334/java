package org.DesignPatterns.AbstractFactoryPattern;

public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("this is sedan");
    }
}
