package org.DesignPatterns.StrategyDesignPattern;

public class CLient {
    public static void main(String[] args) {
        System.out.println("UPI Interface");

        SendMoneyStrategy strategy = new SendMoneyUpi();
        SendMoneyOptions options = new SendMoneyOptions(strategy);
        options.setSendmoney(strategy);

        options.perform(100);
    }
}
