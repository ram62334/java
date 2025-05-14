package org.DSA.Stack;

import java.util.NoSuchElementException;

public class StackFunctions<T> {
//    private static final T[] T = ;
    public int size;
    public T[] arr;
    public int top;

    public StackFunctions(int size) {
        this.size = size;
        this.arr = (T[]) new Object[size];
        top = -1;
    }

    public void push(T i) {
        if (checkFull()) {
            System.out.println("stack is full");
            return;
        } else {
            arr[++top] = i;
//            top++;
            System.out.println("element inserted");
        }
    }

    public T pop() {
        if (checkEmpty()) {
            System.out.println("stack is empty");
            throw new NoSuchElementException();
        } else {
//            System.out.println(arr[top] + " lement poped");
            return arr[top--];
        }
    }

    public boolean checkEmpty() {
        if (top == -1)
            return true;
        else return false;
    }

    public boolean checkFull() {
        if (top == arr.length - 1)
            return true;
        else return false;
    }

    public T peek() {
        if (!checkEmpty())
            return arr[top];
        else throw new IllegalArgumentException();
    }

    public void display(StackFunctions sf) {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);
        }
    }

    //  check if string is valid
    public boolean checkValidity(String str, StackFunctions sf) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                sf.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (sf.checkEmpty())
                    return false;
            }
            char top = (char) sf.peek();
            if (c == '}'&&c == top || c==']'&&c == top || c==')'&&c == top) {
                sf.pop();
            }
            else return false;
        }
        return true;
    }
}
