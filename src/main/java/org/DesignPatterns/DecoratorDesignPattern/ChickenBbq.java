package org.DesignPatterns.DecoratorDesignPattern;

public class ChickenBbq extends Pizza{
    @Override
    public String getDescription() {
        return super.getDescription()+" BBQ";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
