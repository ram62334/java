package org.DesignPatterns.ProxyDesignPattern;

public class ProxyClass implements Account{
    String name;
    ProxyClass(String name){
        this.name=name;
    }
    bankAccount bnk;

    @Override
    public void showAccountNum() {
        if (checkAccUser(name)) {
            bnk = new bankAccount();
            bnk.showAccountNum();
        }
    }
    public boolean checkAccUser(String name){
        if (name.equals("ram"))
           return true;
        else
        return false;
    }
}
