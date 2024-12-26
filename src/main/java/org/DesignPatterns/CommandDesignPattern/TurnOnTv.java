package org.DesignPatterns.CommandDesignPattern;

public class TurnOnTv implements Command{
    @Override
    public void execute() {
        System.out.println("turn on TV");
    }
}
