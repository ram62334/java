package org.DSA.Queue.StackQueue;

public class StackQueueMain {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
    }
}
