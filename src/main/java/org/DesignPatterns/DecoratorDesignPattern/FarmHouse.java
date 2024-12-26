package org.DesignPatterns.DecoratorDesignPattern;

public class FarmHouse extends Pizza{
    @Override
    public String getDescription() {
        return super.getDescription()+" FarmHouse";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
