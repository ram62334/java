package org.DSA.List.SingleLL;

public class LinkedList {
  //  LinkedList list;
     Node head;
     Node curr;

    public void insert(LinkedList list, int arr) {
        Node n = new Node(arr);
        if (head == null) {
            head=n;
            curr = head;
        }
        else{
            curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=n;
//            curr=curr.next;
        }
    }

    public void display(LinkedList list){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }

    public void reverseList(LinkedList list) {
        Node prev=null;
        Node cur=head;
        Node next=cur;

        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }
}
