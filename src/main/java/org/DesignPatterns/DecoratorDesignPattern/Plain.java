package org.DesignPatterns.DecoratorDesignPattern;

public class Plain extends Pizza{

    @Override
    public String getDescription() {
        return super.getDescription()+" Pizza";
    }

    @Override
    public int getCost() {
        return 40;
    }
}
