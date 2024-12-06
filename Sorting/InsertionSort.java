package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,2,10,9,1,3/*,4,11,12,6,7,8*/};
        System.out.println("before sort");
        for (int i=1; i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
       // sort(arr);
    }

    private static void sort(int[] arr) {
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
            for (int k=0;k<arr.length;k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
