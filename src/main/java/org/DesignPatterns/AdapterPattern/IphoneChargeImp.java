package org.DesignPatterns.AdapterPattern;

public class IphoneChargeImp implements IphoneCharger{
    @Override
    public void charge() {
        System.out.println("iphone getting charged by it's charger");
    }
}
