package org.Arrays1;

public class RotateRight {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int r=1;
        int p=0;
        while(p<r){
            int last=arr[arr.length-1];
            for (int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=last;
            p++;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
