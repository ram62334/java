package org.DesignPatterns.AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
//        client needs a hatchback from indian factory with indian specs
        CarFactory cf = new IndianFactory();
        Car c = cf.createCar();
        CarSpecs specs = cf.createSpecs();

        c.assemble();
        specs.Display();


    }
}
