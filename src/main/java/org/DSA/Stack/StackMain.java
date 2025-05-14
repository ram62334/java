package org.DSA.Stack;

public class StackMain {
    public static void main(String[] args) {
        int[] arr={2,5,6,1};
        StackFunctions sf = new StackFunctions(3);
//        sf.push(3);
//        sf.push(2);
//        sf.push(5);
//        sf.push(6);
//        sf.pop();
//        sf.pop();
//        sf.pop();
//        sf.pop();
//        sf.display(sf);

//        tocheck if string is valid
        if (sf.checkValidity("{[(]}", sf)){
            System.out.println("string is valid");
        }
        else System.out.println("string is not valid");

    }
}
