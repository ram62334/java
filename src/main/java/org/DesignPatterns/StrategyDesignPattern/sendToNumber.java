package org.DesignPatterns.StrategyDesignPattern;

public class sendToNumber implements SendMoneyStrategy{
    @Override
    public void sendMoney(long amount) {
        System.out.println("sent to number");
    }
}
