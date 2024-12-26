package org.DesignPatterns.DecoratorDesignPattern;

public class CheeseCrust extends Pizza {
    @Override
    public String getDescription(){
        return "this is cheese crust pizza";
    }

    @Override
    public int getCost(){
        return 100;
    }
}
