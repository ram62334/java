package org.DesignPatterns.CompositeDesignPattern;

public class Client {
    public static void main(String[] args) {
        SimpleTask s1 = new SimpleTask("task1");
        System.out.println(s1.getTitle());
        SimpleTask s2 = new SimpleTask("task2");

        Composition c = new Composition();
        c.setTitle("composite class");
        c.setTask(s1);
        c.setTask(s2);
        c.display();


    }
}
