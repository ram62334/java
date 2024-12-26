package org.Java8;

public class LinkedList {

     Node head;
     Node current;
      int createList(int i) {
        Node n = new Node(i);
        if (head == null){
            head = n;
            current = head;
        }
        else{
            current.next=n;
            current=current.next;
        }
        return i;
    }

     void printList() {
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    int returnCurrent(){
          return current.data;
    }

    public void insertAtPos(int i, int data) {
          Node n = head;
          Node newNode = new Node(data);
          if (i==1){
              newNode.next=head;
              head=newNode;
              return;
          }
          int pos=1;
          while(pos<i-1){
              n=n.next;
              pos++;
          }
          newNode.next = n.next;
          n.next=newNode;
    }
}
