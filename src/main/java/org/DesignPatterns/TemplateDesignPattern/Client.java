package org.DesignPatterns.TemplateDesignPattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("Tea or coffee?");
        BreweryMaker bw = new Cofee();
        bw.makeBrewery();
    }
}
