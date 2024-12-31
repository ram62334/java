package org.DesignPatterns.StateDesignPattern;

public class Client {
    public static void main(String[] args) {
        MachineContext machine = new MachineContext();

        VendingState state = new ReadyState();
        machine.setState(state);
        machine.request();

        VendingState state1 = new CashWithdraw();
        machine.setState(state1);
        machine.request();
    }
}
