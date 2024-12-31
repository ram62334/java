package org.DesignPatterns.StateDesignPattern;

public class CashWithdraw implements VendingState{
    @Override
    public void handle() {
        System.out.println("how much you want to withdraw");
    }
}
