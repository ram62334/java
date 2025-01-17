package org.Patterns.MonotonicStack;

import org.DSA.Stack.StackFunctions;

public class NextlargestNumber {
    public static void main(String[] args) {
        int arr[] = {6, 0, 8, 1, 3};
        StackFunctions sf = new StackFunctions(arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (sf.checkEmpty()){
                sf.push(arr[i]);
                arr[i]=-1;
            }
            else {
                while(!sf.checkEmpty()&&arr[i]>sf.peek()){
                    sf.pop();
                }
                if (!sf.checkEmpty()) {
                    int j=arr[i];
                    arr[i] = sf.peek();
                    sf.push(j);
                }
                else {
                    sf.push(arr[i]);
                    arr[i]=-1;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
