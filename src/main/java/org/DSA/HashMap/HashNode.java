package org.DSA.HashMap;

public class HashNode<k,v> {
    k key;
    v value;
    HashNode<k,v> next;

    public HashNode(k key, v value) {
        this.key = key;
        this.value = value;
        this.next=null;
    }
}
