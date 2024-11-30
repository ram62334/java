package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,2,10,9,1,3,4,11,12,6,7,8};
        System.out.println("before sorting");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort(arr);
    }

    public static void sort( int[] arr ){
        int min=-1;
       // boolean flag=false;
        for (int i=0;i<arr.length;i++){
            min=i;
            //flag=false;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<arr[min]) {
                    //flag = true;
                    min = j;
                }
            }
            //if(flag==true) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
           // }
        }
    }
}
