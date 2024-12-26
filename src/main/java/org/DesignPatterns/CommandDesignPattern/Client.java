package org.DesignPatterns.CommandDesignPattern;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        Device sterio = new Sterio();

        Remote remote = new Remote(tv);
        Command c = new TurnOnTv();
        remote.setCommand(c);
        remote.pressBotton();
    }
}
