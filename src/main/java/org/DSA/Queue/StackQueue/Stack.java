package org.DSA.Queue.StackQueue;

public class Stack {
    int size;
    int[] stack1;
    int[] stack2;
    int f1;
    int f2;

    Stack( int size ){
        this.size = size;
        stack1 = new int[size];
        stack2 = new int[size];
        f1 = -1;
        f2 = -1;
    }

    //add element
    public void add( int data ) {
        if (isFull()) {
            System.out.println("stack is full");
            return;
        }
        if (f1 == -1) {
            stack1[++f1] = data;
        } else {
            while (f1 != -1) {
                stack2[++f2] = stack1[f1];
                f1--;
            }
            stack1[++f1] = data;
            while (f2 != -1) {
                stack1[++f1] = stack2[f2];
                f2--;
            }
        }
    }
        //remove
    public int remove() {
        if (f1 == -1) {
            System.out.println("stack is empty");
            return -1;
        }
        int data = stack1[f1];
        f1--;
        return data;
    }

    //to peek
    public int peek(){
        if(f1==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return stack1[f1];
    }
    private boolean isFull() {
        if( f1+1 == size){
            return true;
        }
        return false;
    }
}
