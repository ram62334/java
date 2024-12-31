package org.DSA.Queue.CircularQueue;

public class QueueMain {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.remove());
        q.add(6);
    }
}
