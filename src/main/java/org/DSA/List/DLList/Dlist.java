package org.DSA.List.DLList;

public class Dlist {
    Node head;

    public static void print(Dlist list) {
        Node temp = list.head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Dlist build(Dlist list, int data) {

        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }
        return list;
    }

    //to insert at the end
    public Dlist insertEnd(Dlist list, int data) {
        Node node = new Node(data);

        if (head == null) {
            node.next = null;
            node.prev = null;
            head = node;
            return list;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;

        return list;
    }

    //to insert at a given position
    public Dlist insertAtPos(Dlist list, int pos, int data) {
        // TODO Auto-generated method stub
        Node temp = head;
        Node node = new Node(data);

        if (pos == 1) {
            return (list.build(list, data));
        }

        while (pos-- != 0) {
            if (pos == 1) {
                node.next = temp.next;
                node.prev = temp;
                temp.next = node;
            }
            temp = temp.next;
        }

        return list;
    }
}
