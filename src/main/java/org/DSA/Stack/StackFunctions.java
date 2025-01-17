package org.DSA.Stack;

public class StackFunctions {
    public int size;
    public int[] arr;
    public int top;

    public StackFunctions(int size) {
        this.size=size;
        this.arr=new int[size];
        top=-1;
    }

    public void push(int i) {
        if (checkFull()) {
            System.out.println("stack is full");
            return;
        }
        else{
            arr[++top]=i;
//            top++;
            System.out.println("element inserted");
        }
    }

    public void pop(){
        if (checkEmpty()){
            System.out.println("stack is empty");
            return;
        }
        else{
            System.out.println(arr[top]+" lement poped");
            top--;
        }
    }

    public boolean checkEmpty() {
        if (top==-1)
            return true;
        else return false;
    }

    public boolean checkFull() {
        if (top== arr.length-1)
            return true;
        else return false;
    }

    public int peek(){
        if (!checkEmpty())
            return arr[top];
        else throw new IllegalArgumentException();
    }

    public void display(StackFunctions sf){
        for (int i=0;i<=top;i++){
            System.out.print(arr[i]);
        }
    }
}
