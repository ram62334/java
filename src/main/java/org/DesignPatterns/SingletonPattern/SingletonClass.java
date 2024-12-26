package org.DesignPatterns.SingletonPattern;
//This pattern is used when we want to create only one instance of a class
//In applications where creating and managing database connections is resource-heavy, using a Singleton ensures that there’s just one connection maintained throughout the application.
public class SingletonClass {
//    use static variable to hold instance so that it is shared globally
    static SingletonClass obj;

//    singleton class shld always have private constructor
    private SingletonClass(){
        System.out.println("this is singleton");
    }

//    use static method which returns instance
    public static SingletonClass getInstance(){
        if (obj == null){
            obj = new SingletonClass();
        }
        return obj;
    }

}
