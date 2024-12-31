package org.DSA.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,2,10,9,1,3};
        sort(arr);
    }

    private static void sort(int[] arr) {
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                for(int k=0;k<arr.length;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
