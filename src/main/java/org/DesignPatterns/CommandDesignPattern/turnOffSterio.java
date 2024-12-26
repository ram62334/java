package org.DesignPatterns.CommandDesignPattern;

public class turnOffSterio implements Command{
    @Override
    public void execute() {
        System.out.println("turn off sterio");
    }
}
