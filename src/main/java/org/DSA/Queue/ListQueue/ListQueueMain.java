package org.DSA.Queue.ListQueue;

public class ListQueueMain {
    public static void main(String[] args) {
        ListQueue q = new ListQueue();

        q.add(1);
        q.add(2);
        q.add(3);
      //  System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
    }
}
