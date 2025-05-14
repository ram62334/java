package org.Patterns.FastAndSlowPointers;

import org.DSA.List.SingleLL.LinkedList;
import org.DSA.List.SingleLL.Node;

//given a linked list find nth element from last
public class FindNthElementFromLast {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(l,3);
        l.insert(l,6);
        l.insert(l,1);
        l.insert(l,7);
        l.insert(l,2);

        System.out.print(findFromLast(l,4));
    }

    public static int findFromLast(LinkedList l, int n) {
        int count=0;
        Node slow=l.head;
        Node fast=l.head;
        while(fast!=null){
            if (count!=n){
                fast=fast.next;
                count++;
            }
            else{
                fast=fast.next;
                slow=slow.next;
            }
        }
        return (int) slow.data;
    }
}
