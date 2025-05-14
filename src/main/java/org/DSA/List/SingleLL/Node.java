package org.DSA.List.SingleLL;

public class Node<T extends Comparable<T>> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
