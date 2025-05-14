package org.Java8;

public class Recurssion {
    public static void main(String[] args) {
     //   System.out.println(findFactorial(3));

        System.out.println(fibNum(7));
    }
//    to find factorial of a number
    private static int findFactorial(int i) {
        if (i==1||i==0)
            return 1;
        else return i*findFactorial(i-1);
    }
//    to find fibonaci of a number
    public static int fibNum(int i){
        if (i==1)
            return 1;
        else if (i==0)
            return 0;

        else return fibNum(i-1)+fibNum(i-2);
    }

//    Given a string, find all possible palindromic partitions of given string.
//    Input:  geeks
//    Output: g e e k s
//    public static String palendromeSubString(String str){
//        if(str.charAt(n)==)
//    }
    
}
