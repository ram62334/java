package org.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class AlMainClass implements DemoFace, DemoFace2{

   static List<Integer> l=new ArrayList();
   static int sum=0;
   static Integer average;
//overriding default method
    //from java 1.8 we can use multiple inheritance, below shows how we call specific method of two interfaces
    //this is restricted to interface level only not at the class level
    @Override
    public void defdemo() {
       // DemoFace2.super.defdemo();
        //DemoFace.super.defdemo();
        System.out.println("default method overrided");
    }

    public static void main(String[] args) {
        l.add(10);
        l.add(20);
        l.add(5);
        l.add(3);
        l.add(25);
        //implementing comparator method compare method using lambda exp
        //(i1<i2)?-1:(i1>i2)?+1:0|sort in ASC|if condition using ternary
//        Comparator<Integer> cp = (i1,i2)->(i1<i2)?-1:(i1>i2)?+1:0;
//        Collections.sort(l,cp);
//        System.out.println(l);
        //implementing Anonymous class
//        DemoFace df = new DemoFace() {
//           average=(l)->{
//               for(Integer obj:l){
//                   sum=+obj;
//               }
//            }
//
//        }
        //calling static method of interface
        DemoFace.staticDemo();
        AlMainClass al = new AlMainClass();
        al.defdemo();

//        PREDICATE
//        it is a functional Interface
//        want to use one or multiple boolean conditions? use predicates
//        predicate FI has one method public abstract boolean test()
        String str[] = {"ram", "laxman", "raghuveer"};
//        predicate fucntion to get names containing length>3
//        ***always specify type of input
        Predicate<String> p1 = s -> s.length() > 3;
        for (String str1 : str) {
            if (p1.test(str1)) {
                System.out.println("predicate function to get all names having length>3" + str1);
            }
        }
//        combining two predicates
//        predicate to check if names start with 'r'
        Predicate<String> p2 = s1 -> s1.charAt(0) == 'r';
        for (String st : str) {
//      we can use 'AND' 'OR','NEGATE  interchangebly

            if (p1.and(p2).test(st))
                System.out.println("names having length>3 and starts with 'r'" + st);
        }
    }
}
