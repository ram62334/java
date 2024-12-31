package org.Java8;

public class Student {
    String id;
    String name;
    int marks;

    public Student(String id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void ThreadRun(){
        for (int i=0;i<10;i++){
            System.out.println("hello child");
        }
    }
}
