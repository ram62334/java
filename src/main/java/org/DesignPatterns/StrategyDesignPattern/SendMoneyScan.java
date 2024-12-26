package org.DesignPatterns.StrategyDesignPattern;

public class SendMoneyScan implements SendMoneyStrategy{

    @Override
    public void sendMoney(long amount) {
        System.out.println("money send through Scan");
    }

}
