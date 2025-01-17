package org.Patterns.FastAndSlowPointers;

import org.DSA.List.SingleLL.LinkedList;

public class FindPalendrome {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(ll,'m');
        ll.insert(ll,'a');
        ll.insert(ll,'l');
        ll.insert(ll,'a');
        ll.insert(ll,'y');
        ll.insert(ll,'a');
        ll.insert(ll,'l');
        ll.insert(ll,'a');
   //     ll.insert(ll,'m');

        if (ll.checkPalendrome(ll))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
