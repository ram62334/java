package org.Patterns.PrefixSumPattern;
//Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
public class RangeSumQuery {
     static int sum=0;
    static int arr[] = {-2, 0, 3, -5, 2, -1};
    static int range[]={2,5};

     static  int[] sumArr=new int[arr.length];
    public static void main(String[] args) {
//        int arr[] = {-2, 0, 3, -5, 2, -1};
//        int range[]={0,2};
        //int sum=0;

        sumArr[0]=arr[range[0]];
        int j=0;

        for (int i=1;i< arr.length;i++){
            sumArr[i]=arr[i]+sumArr[i-1];
        }
//        for (int i=0;i<sumArr.length;i++){
//           sum+=sumArr[i];
//        }
         sum=sumRange(range[0],range[1] );
        System.out.print(sum);
    }

    public static int sumRange(int left, int right) {
        return sumArr[right] - sumArr[left] ;
    }

}
