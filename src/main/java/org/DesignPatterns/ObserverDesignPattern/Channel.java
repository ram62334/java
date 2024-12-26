package org.DesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

//subject
public class Channel {
    Subscriber scb;
    List<Subscriber> ls = new ArrayList<>();
    String chname;
    Channel(String chname){
        this.chname=chname;
    }

    public void subscribe(Subscriber scb){
        ls.add(scb);
        System.out.println(scb.name+" has been subscribed to "+this.chname);
    }

    public void upload(){
        for (Subscriber sc:ls){
            sc.update(this);
        }
    }
}
