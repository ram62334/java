package org.Patterns.PrefixSumPattern;
//Input: arr[] = {10, 20, 10, 5, 15}
//Output: prefixSum[] = {10, 30, 40, 45, 60}
//prefixSum[0] = 10,
//prefixSum[1] = prefixSum[0] + arr[1] = 30,
//prefixSum[2] = prefixSum[1] + arr[2] = 40 and so on
public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {-2, 0, 3, -5, 2, -1};
        int prefixsum[] = new int[arr.length];
        int j = 0;
        prefixsum[j] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixsum[j + 1] = arr[i] + prefixsum[j];
            j++;
        }
        for (int k = 0; k < prefixsum.length; k++) {
            System.out.print(prefixsum[k] + " ");
        }
        int sum=0;
        for (int i=0;i<prefixsum.length;i++){
            sum+=prefixsum[i];
        }
        System.out.println(sum);
//        Using recurssion
//        findSum(arr, prefixsum, arr.length - 1);
//        for (int k = 0; k < prefixsum.length; k++) {
//            System.out.print(prefixsum[k] + " ");
//        }
//    }
//            private static void findSum ( int[] arr, int[] prefixSum, int i){
//                if (i == 0) {
//                    prefixSum[i] = arr[i];
//                    return;
//                }
//
//                findSum(arr, prefixSum, i - 1);
//                prefixSum[i] = prefixSum[i - 1] + arr[i];
//            }
    }
}

