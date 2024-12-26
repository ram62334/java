package org.Java8;
//to add two numbers in two linked list which are reverse order using recursion
public class AddTwoNumbers {

    public static void main(String[] args) {
        LinkedList lst1 = new LinkedList();

       lst1.createList(2);
        lst1.createList(3);
        lst1.createList(4);
        lst1.insertAtPos(2, 5);
        lst1.printList();

//        LinkedList lst2 = new LinkedList();
//        lst2.createList(7);
//        lst2.createList(0);
//        lst2.createList(4);
//
//        revereAndAdd(lst1,lst2);

    }

    private static void revereAndAdd(LinkedList lst1, LinkedList lst2) {
        
    }
}
