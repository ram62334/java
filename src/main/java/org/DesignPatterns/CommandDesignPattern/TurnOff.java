package org.DesignPatterns.CommandDesignPattern;

public class TurnOff implements Command{
    @Override
    public void execute() {
        System.out.println("turn off TV");
    }
}
