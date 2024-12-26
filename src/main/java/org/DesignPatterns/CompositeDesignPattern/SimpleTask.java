package org.DesignPatterns.CompositeDesignPattern;
//this ia a leaf
public class SimpleTask implements Task{
    String title;
    
    SimpleTask(String title){
        this.title=title;
    }
    @Override
    public String getTitle() {
        return title;
    }
@Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("simple task");
    }

}
