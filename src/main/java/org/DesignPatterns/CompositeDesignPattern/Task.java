package org.DesignPatterns.CompositeDesignPattern;
//Component
//provides methods which are common to both leaf and composite clases
public interface Task {
    String getTitle();
    void setTitle(String title);
    void display();
}
