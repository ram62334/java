package org.DesignPatterns.StrategyDesignPattern;

public class SendMoneyUpi implements SendMoneyStrategy{


    @Override
    public void sendMoney(long amount) {
        scan();
        System.out.println("sent to upi");
    }

    void scan(){
        System.out.println("scan done");
    }
}
