package org.DesignPatterns.TemplateDesignPattern;

public class Tea extends BreweryMaker{
    @Override
    public void brew() {
        System.out.println("add tea powder and make tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("add ginger");
    }
}
