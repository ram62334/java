package org.Java8;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//        Comparator<Integer> cp = (i1, i2)->(i1<i2)?-1:(i1>i2)?+1:0;
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
//        predicate to check if names start with 'r' and length>3
        Predicate<String> p2 = s1 -> s1.charAt(0) == 'r';
        for (String st : str) {
//      we can use 'AND' 'OR','NEGATE  interchangebly

            if (p1.and(p2).test(st))
                System.out.println("names having length>3 and starts with 'r'" + st);
        }

//        Function
//        Predicate only returns boolean type you want to return different types? use Function
//        it is a FI, it's methos is apply()
        List<Student> sl = new ArrayList();
        sl.add(new Student("p11", "ram", 85));
        sl.add(new Student("p12", "ravi", 65));
        sl.add(new Student("p13", "shyam", 75));
        sl.add(new Student("p14", "sunny", 90));
        sl.add(new Student("p15", "bunny", 40));

//        generate grades using Function
        Function<Student, String> func = s -> {
            String grade = "";
            int m = s.marks;
            if (m > 85) grade = "DST";
            else if (m >= 60) grade = "FC";
            else if (m >= 50) grade = "SC";
            else grade = "F";
            return grade;
        };
//        Function chainng
        Function<Integer, Integer> f1 = i -> 2 * i;
        Function<Integer, Integer> f2 = i -> i * i * i;
//        below f1 is executed first follwed by next
        System.out.println(f1.andThen(f2).apply(4));//4
//        below f2 folled by f1
        System.out.println(f1.compose(f2).apply(2));//i*i*i->8->2*8->16

//      Predicate to check if student marks more than 60
        Predicate<Student> p = s -> s.marks > 60;

//      CONSUMER
//        It is a FI
//        it does not return anything but only consumes, it's method is accept
//        consumer to display student details
        Consumer<Student> c = s -> {
            System.out.println("Student id " + s.id);
            System.out.println("Student name " + s.name);
            System.out.println("Student marks " + s.marks);
            System.out.println("");
        };

        //  Integer[] arr;
       // Integer[] arr = new Integer[0];
        for (Student s : sl) {
//         fetch student details if marks>60 or grade is FC
            if (func.apply(s).equals("FC") || p.test(s))
                c.accept(s);
        }

//            METHOD REFERENCING
//            it is a concept where you reference existing method without lambda
//            it helps in code resuability
            Runnable r = Student::ThreadRun;
            Thread th = new Thread(r);
//            reference method can be static or non static, it can return any type but shld match input args
            th.run();

//            CONSTRUCTOR REFERENCING
//            used to get objects
            ConstructorRferencing cr = Student::new;
            Student std = cr.getObj("1", "niuav", 45);

//            STREAMS
//            collections are collecction of objects, streams are about processing the data in it
//
//            Filters

            List<Integer> l = new ArrayList();
            l.add(2);
            l.add(4);
            l.add(7);
            l.add(9);

            //            to get even numbers from a list
            List<Integer> l2 = l.stream().filter(n -> n % 2 == 0).toList();

//          Map
//            it touches every object

//            to give grace marks of 5 to all students
            List<Student> sb = new ArrayList<>();
            sb.add(new Student("123", "xyz", 50));
            sb.add(new Student("124", "tys", 30));
            sb.add(new Student("125", "uhs", 84));

            sb.stream().map(st -> {
                st.setMarks(st.getMarks() + 5);
                return st;
            }).toList().forEach(c);

//            Min&Max
            Integer[] arr = {4, 3, 8, 6, 1, 10};
            Arrays.stream(arr).min((i1, i2) -> {
//               i2.compareTo(i1) for Max
                return i2.compareTo(i1);
            }).stream().toList().forEach(System.out::println);

//        Collect
        List<Integer> lt = Arrays.stream(arr).filter(i->i>4).collect(Collectors.toList());

//        Sort
//        below by default sorts in ASC if want in DSC use comparator as parameter to sorted()
        Arrays.stream(arr).sorted().toList().forEach(System.out::println);

    }
}
