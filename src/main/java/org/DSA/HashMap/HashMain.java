package org.DSA.HashMap;

public class HashMain {
    public static void main(String[] args) {
        HashFunctions hf = new HashFunctions();
        hf.put(2,3);
        hf.put(3,7);
        hf.put(2,3);
        hf.put(2,4);
        hf.put(3,9);

        Person p1 = new Person("alice", 25);
        Person p2 = new Person("alice", 25);

        hf.put(p1, "eng");
        hf.put(p2, "doc");

        System.out.print(hf.get(p2));
    }
}
