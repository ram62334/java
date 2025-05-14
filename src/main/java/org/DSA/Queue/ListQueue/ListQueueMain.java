package org.DSA.Queue.ListQueue;

public class ListQueueMain {
    public static void main(String[] args) {
        QueueFunctions qf = new QueueFunctions();

//        qf.enqueue(1);
//        qf.enqueue(2);
//        qf.enqueue(3);
//        qf.display();
//        qf.dequeue();
//        qf.display();
//        qf.dequeue();
//        qf.display();
//
//        System.out.println(qf.length);
        String[] r=QueueFunctions.printBinary(10);
        for (String re:r){
            System.out.print(re+" ");
        }
    }
}
