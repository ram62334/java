package org.DesignPatterns.StateDesignPattern;

public class MachineContext {
    VendingState state;

    public void setState(VendingState state){
        this.state=state;
    }

    void request(){
       state.handle();
   }
}
