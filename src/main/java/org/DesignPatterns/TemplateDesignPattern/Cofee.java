package org.DesignPatterns.TemplateDesignPattern;

public class Cofee extends BreweryMaker{
    @Override
    public void brew() {
        System.out.println("add coffe powder and brew");
    }

    @Override
    public void addCondiments() {
        System.out.println("add sugar");
    }
}
