package org.DesignPatterns.DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("welocome to store");

        Pizza pizza = new ChickenBbq();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
//        add tomato topping
        DecoratorClass dc = new TomatoToppings(pizza);
        System.out.println(dc.getDescription());
        System.out.println(dc.getCost());
//        reference chaining
        dc = new PaneerToppings(dc);
        System.out.println(dc.getDescription());
        System.out.println(dc.getCost());


    }
}
