package org.DesignPatterns.AbstractFactoryPattern;

public class HatchBack implements Car{
    @Override
    public void assemble() {
        System.out.println("this is hatchback");
    }
}
