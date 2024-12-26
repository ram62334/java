package org.DesignPatterns.BuilderDesignPattern;
//This pattern is used when you want a customized object
//when some attributes of the obj are optional
//always use setters to return object
public class Client {
    public static void main(String[] args) {
        PhoneFactory ph = new PhoneFactory();
        ph.setOs("windows");
//        say we want a cmputer with only os and processor
      //  ph.setHarddisc("sandisk");
        ph.setProcessor("intel");

        System.out.println(ph.toString());
    }
}
