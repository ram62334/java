package org.DSA.HashMap;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class HashFunctions <k,v>{
    int capacity;
    List<HashNode<k,v>> bucket;
    int size;
    int initial_capacity = 5;

    public HashFunctions() {
        this.capacity = initial_capacity;
        this.bucket = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
    }

    public int getBucketIndex(k key) {
        int hashcode = key.hashCode();
        return Math.abs(hashcode) % capacity;  // Ensure index is always positive
    }


    public void put(k key, v value) {
        int bucketIndex = getBucketIndex(key);

        if (bucketIndex >= bucket.size()) return;  // Prevent out-of-bounds access

        HashNode<k,v> head = bucket.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        HashNode<k,v> newpair = new HashNode<>(key, value);

        if (bucket.get(bucketIndex) == null) {
            bucket.set(bucketIndex, newpair);
        } else {
            newpair.next = bucket.get(bucketIndex);
            bucket.set(bucketIndex, newpair);
        }

        double loadfactor = (1.0) * size / capacity;
        if (loadfactor > 0.7) {
            rehash();
        }
    }

    private void rehash() {
        List<HashNode<k,v>> temp = bucket;
        bucket = new ArrayList<>();
        capacity *= 2;
        for (int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
        size = 0;

        for (int i = 0; i < temp.size(); i++) {
            HashNode<k,v> head = temp.get(i);
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    public v get(k key) {
        int bucketIndex = getBucketIndex(key);
        if (bucketIndex >= bucket.size()) return null;  // Prevent out-of-bounds access
        HashNode<k,v> head = bucket.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void remove(k key) {
        int bucketIndex = getBucketIndex(key);
        HashNode<k,v> head = bucket.get(bucketIndex);
        HashNode<k,v> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null)
                    bucket.set(bucketIndex, head.next);
                else
                    prev.next = head.next;
                head.next = null;
                size--;
                break;
            }
            prev = head;
            head = head.next;
        }
    }
}
