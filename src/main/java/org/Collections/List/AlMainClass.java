package org.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
    }
}
