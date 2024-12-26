package org.DesignPatterns.DecoratorDesignPattern;

public class Handmade extends Pizza{
    @Override
    public String getDescription(){
        return "this is handmade pizza";
    }

    @Override
    public int getCost(){
        return 70;
    }
}
