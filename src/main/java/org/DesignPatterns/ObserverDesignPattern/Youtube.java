package org.DesignPatterns.ObserverDesignPattern;
//CLient
public class Youtube {
    public static void main(String[] args) {
//    create a new channel
        Channel ch = new Channel("SkyRockrz");
//    create subscribers
        Subscriber s1 = new Subscriber("ram");
        Subscriber s2 = new Subscriber("ravi");
        Subscriber s3 = new Subscriber("raju");
//    subscribe to the channel
        s1.subscribeChanel(ch);
        s2.subscribeChanel(ch);
        s3.subscribeChanel(ch);
//        upload a video so that all subscribers get notification
        ch.upload();
    }

}
