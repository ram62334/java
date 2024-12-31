package org.DSA.Queue.CircularQueue;

public class Queue {
    int size;
    int front = -1;
    int rear = -1;
    int q[];

    Queue(int size ){
        this.size = size;
        q = new int[size];
    }
    //check if queue is empty
    public boolean isEmpty(){
        if( front == -1 && rear == -1 ) {
            return true;
        }
        return false;
    }
    //to add element
    public void add( int data ){
        if( front == (rear+1)%size ){
            System.out.println("queue is full");
        }
        else{
            if(isEmpty()){
                front++;
                rear = (rear+1)%size;
                q[rear] = data;
            }
            else {
                rear = (rear + 1) % size;
                q[rear] = data;
            }
        }
    }

    //to remove element
    public int remove(){
        if( isEmpty() ){
            System.out.println("queue is empty");
            return -1;
        }
        int data = q[front];
        if( front == rear ){
            front = -1;
            rear = -1;
        }
        front = (front+1)%size;
        return data;
    }

    //to peek
    public int peek(){
        if( isEmpty() ){
            return -1;
        }
        return q[front];
    }
}
