package org.DesignPatterns.StateDesignPattern;

public class CashDeposit implements VendingState{
    @Override
    public void handle() {
        System.out.println("how much you want to deposit");
    }
}
