package org.DesignPatterns.CommandDesignPattern;

public class turnOnSterio implements Command{
    @Override
    public void execute() {
        System.out.println("turn on sterio");
    }
}
