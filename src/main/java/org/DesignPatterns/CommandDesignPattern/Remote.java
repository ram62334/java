package org.DesignPatterns.CommandDesignPattern;

public class Remote {
    Device device;
    Command command;

    Remote(Device device){
        this.device=device;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    void pressBotton(){
        command.execute();
    }
}
