package org.DesignPatterns.AdapterPattern;

public class Phone {
    IphoneCharger ich;

    public IphoneCharger getIch() {
        return ich;
    }

    public void setIch(IphoneCharger ich) {
        this.ich = ich;
    }

    public void phoneCharge(){
        ich.charge();
    }

}
