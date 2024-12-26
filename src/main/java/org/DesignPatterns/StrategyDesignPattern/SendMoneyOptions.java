package org.DesignPatterns.StrategyDesignPattern;

public class SendMoneyOptions {
    SendMoneyStrategy sendmoney;
    SendMoneyOptions(SendMoneyStrategy sendmoney){
        this.sendmoney=sendmoney;
    }

    public void setSendmoney(SendMoneyStrategy sendmoney) {

        this.sendmoney=sendmoney;
    }
    void perform(long amount){
        sendmoney.sendMoney(amount);
    }

}
