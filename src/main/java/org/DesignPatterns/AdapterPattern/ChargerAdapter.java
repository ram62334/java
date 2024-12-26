package org.DesignPatterns.AdapterPattern;

public class ChargerAdapter implements IphoneCharger {
    Charger ch = new Charger();
    @Override
    public void charge() {
        ch.chargePhone();
    }
}
