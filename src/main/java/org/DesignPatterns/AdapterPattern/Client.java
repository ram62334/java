package org.DesignPatterns.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        Phone ph = new Phone();
//        when you want to chargePhone your iphone with iphone charger
//        IphoneChargeImp imp = new IphoneChargeImp();
//        ph.setIch(imp);
//        ph.phoneCharge();
//        when you lost ur iphone charger but now urgetly u need any charger available
        ChargerAdapter cap = new ChargerAdapter();
        ph.setIch(cap);
        ph.phoneCharge();

    }
}
