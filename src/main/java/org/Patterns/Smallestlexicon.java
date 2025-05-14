//package org.Patterns;
//
//import java.util.*;
//
////Given three robots roy, ben and kevin which are having string of lrngth n
////Move 1: Move the first character from Roy's string to Ben's string.
////
////Move 2: Move the last character from Ben's string to Kevin's string.
////
////The goal is to perform these moves so that the final string Kevin gets is the smallest possible in dictionary order.
//public class Smallestlexicon {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        String S = sc.next();
//        System.out.println(getSmallestString(N, S));
//    }
//
//    private static boolean getSmallestString(int n, String s) {
//        Deque ben = new ArrayDeque<>();
//        Stack kevin = new Stack();
//        int i=0;
//        while(i<n||!ben.isEmpty()){
//            if (s.charAt(i)<=ben.peekLast()){
//
//            }
//        }
//    }
//}
