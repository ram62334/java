package org.DesignPatterns.ObserverDesignPattern;

public class Subscriber {
    String name;

    Subscriber(String name){
        this.name=name;
    }

    public void subscribeChanel(Channel ch){
        ch.subscribe(this);
    }

    public void update(Channel c){
        System.out.println("hi "+name+" a new video is uploaded by "+ c.chname);
    }
}
