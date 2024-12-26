package org.DesignPatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Composition implements Task{
    private String title;
    List<Task> ls;
    Composition(){
        ls = new ArrayList<>();
    }

    public List<Task> getTask() {
        return ls;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void setTask(Task task) {
        ls.add(task);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void display() {
        System.out.println("Task List: " + title);
        for (Task task : ls) {
            task.display();
        }
    }
}
