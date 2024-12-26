package org.DesignPatterns.FactoryDesignPattern;

public class Client {
//    always hide implementation details
public static void main(String[] args) {
   // osFactory os = new osFactory();
    OsInterface oi = osFactory.getOs("secured and fast");
    assert oi != null;
    oi.specs();
}
}
