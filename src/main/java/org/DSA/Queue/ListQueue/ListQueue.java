package org.DSA.Queue.ListQueue;

public class ListQueue {
    Node head;
    Node tail;
    ListQueue(){
        head = tail = null;
    }

    public void add( int data ){
        Node node = new Node( data);

        if(head==null && tail==null){
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = tail.next;
    }

    //dequeue
    public int remove(){
        if( head == null){
            System.out.println("list is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;

        if(head == null ){
            tail = null;
        }

        return data;
    }

    //peek
    public int peek(){
        if(head==null){
            System.out.println("list is empty");
            return -1;
        }
        else
            return head.data;
    }
}
