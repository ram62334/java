package org.Collections.List;

import java.util.List;

public interface DemoFace {
    //if only one method and default method is there then we call it functional interface
   // public Object AverageOfList(List l);
    //public Object SumOfList(List l1);

    //from java1.8 onwards we can declare static methods in interface
     static void staticDemo(){
        System.out.println("welcome to java 1.8");
    }

    //default method acts as defender, in future if we need to declare a new method without disturbing the impplementation of existing methods
    default void defdemo(){
         System.out.println("keep it or override in implementation accordingly");
    }
}
