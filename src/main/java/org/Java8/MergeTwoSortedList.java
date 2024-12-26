package org.Java8;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        LinkedList lst1 = new LinkedList();
        lst1.createList(1);
        lst1.createList(2);
        lst1.createList(6);
        lst1.createList(7);

        LinkedList lst2 = new LinkedList();
        lst2.createList(1);
        lst2.createList(3);
        lst2.createList(4);

        LinkedList lst3 = mergeLists(lst1, lst2);
        lst3.printList();
    }

    private static LinkedList mergeLists(LinkedList lst1, LinkedList lst2) {
//        LinkedList lst3 = new LinkedList();
//        Node p1 = lst1.head;
//        Node p2 = lst2.head;
//        Node prev=new Node(0);
//        while(p1!=null && p2!=null){
//            if(p1.data<=p2.data) {
//               // assert prev != null;
//                prev.next = p1;
//                lst3.createList(p1.data);
//                p1=p1.next;
//            }
//            else {
//                //assert prev != null;
//                prev.next = p2;
//                lst3.createList(p2.data);
//                p2=p2.next;
//            }
//        }
//        if (p1!=null){
//            prev.next = p1;
//            while(p1!=null){
//                lst3.createList(p1.data);
//                p1=p1.next;
//            }
//        }
//        else prev.next = p2;
//        while(p2!=null){
//            lst3.createList(p2.data);
//            p2=p2.next;
//        }
//        return lst3;
        if (lst1==null)
            return lst2;
        if (lst2==null)
            return lst1;
        if(lst1.head.data<lst2.head.data) {
            lst1 = mergeLists(lst1, lst2);
            return lst1;
        }
        else{
         lst2 = mergeLists(lst1, lst2);
         return lst2;
        }
    }
}
