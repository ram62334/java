package org.DesignPatterns.TemplateDesignPattern;

public abstract class BreweryMaker {
    public final void makeBrewery(){
        biolWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public abstract void brew();
    public abstract void addCondiments();

    private void pourInCup() {
        System.out.println("pour in cup");
    }

    private void biolWater() {
        System.out.println("boil water");
    }

}
