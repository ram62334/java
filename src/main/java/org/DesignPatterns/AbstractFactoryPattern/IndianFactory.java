package org.DesignPatterns.AbstractFactoryPattern;

public class IndianFactory implements CarFactory{
    @Override
    public Car createCar() {
       return new HatchBack();
    }

    @Override
    public CarSpecs createSpecs() {
        return new IndianSpecs();
    }
}
