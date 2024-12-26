package org.DesignPatterns.DecoratorDesignPattern;

public class PaneerToppings extends DecoratorClass{

    Pizza pizza;
    PaneerToppings(Pizza p){
        this.pizza = p;
    }

    @Override
    public String getDescription() {
        return pizza.description+" with paneer topping";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+30;
    }
}
