package org.Patterns.FastAndSlowPointers;

import org.DSA.List.SingleLL.LinkedList;
import org.DSA.List.SingleLL.Node;

public class FindCycleInLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(ll,1);
        ll.insert(ll,2);
        ll.insert(ll,3);
        ll.insert(ll,4);
        ll.insert(ll,5);

        ll.createCycle(ll,3);

        if (ll.detectCycle(ll)){
            System.out.println("cycle exists");
        }
        else
            System.out.println("no cycle exists");
//        detect the node at which cycle began
        System.out.println(ll.detectCycleNode(ll));

    }

}
