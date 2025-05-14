package org.Patterns.FastAndSlowPointers;

import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a={2,4,6,8};
        int[] b = {1,3,5,7,10};

        int k=a.length-1;
        int l=0;

        while(k>=0&&l<b.length){
            if (a[k]>b[l]){
               a[k--]=b[l++];
            }
            else break;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println(" ");

        for (int j=0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }
    }
}
