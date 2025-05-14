package org.DSA.Queue.ListQueue;

import java.util.NoSuchElementException;

public class QueueFunctions<T> {
    Node<T> front;
    Node<T> rear;
    int length;

    public QueueFunctions() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public Boolean isEmpty(){
        return length==0;
    }

    public void enqueue(T data ){
        Node<T> node = new Node<>(data);
        if (isEmpty()){
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = rear.next;
        }
            length++;
    }

    public T dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        T temp = (T) front.data;
        front=front.next;
//        to make rear null so that the node is deleeted by garbage collector
        if (front==null){
            rear = null;
        }
        length--;
        return temp;
    }

    public void display(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

//    to print binary representation for N
    public static String[] printBinary(int n){
        String[] result=new String[n];
        QueueFunctions<String> qf = new QueueFunctions<>();
        qf.enqueue("1");
        for (int i=0;i<n;i++){
            result[i]=(String)qf.dequeue();
            String n1 = result[i]+"0";
            String n2 = result[i]+"1";
            qf.enqueue(n1);
            qf.enqueue(n2);
        }
        return result;
    }
}
