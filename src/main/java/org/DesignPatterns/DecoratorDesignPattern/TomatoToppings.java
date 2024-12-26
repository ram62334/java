package org.DesignPatterns.DecoratorDesignPattern;

public class TomatoToppings extends DecoratorClass{
    Pizza pizza;

    TomatoToppings(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.description+" with tomato topping";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+20;
    }
}
