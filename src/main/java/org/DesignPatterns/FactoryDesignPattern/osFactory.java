package org.DesignPatterns.FactoryDesignPattern;

public class osFactory {
//    gives desired objects
    public static OsInterface getOs(String str){
        if (str.equals("most used"))
            return new WindowsOs();
        else if (str.equals("secured and fast")) {
            return new Ios();
        }
        else if (str.equals("most secured"))
            return new BlackBerry();
        else return null;
    }
}
