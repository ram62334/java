package org.DSA.Queue.ArrayQueue;

public class ArrayQueue {
    int size;
    int rear;
    int front;
    int[] q;
    ArrayQueue( int size ){
        this.size = size;
        q = new int[size];
        rear = -1;
        front = -1;
    }
}
