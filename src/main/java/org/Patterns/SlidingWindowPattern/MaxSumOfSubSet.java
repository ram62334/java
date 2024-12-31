package org.Patterns.SlidingWindowPattern;

public class MaxSumOfSubSet {
    // Java code O(n*k) solution for finding maximum sum of
// a subarray of size k
        // Returns maximum sum in
        // a subarray of size k.
        static int maxSum(int arr[], int n, int k)
        {
            // Initialize result
          int max_sum=Integer.MIN_VALUE;
          int cur_sum=0;
          int i=0;
          for ( i=0;i<k;i++)
              cur_sum+=arr[i];
          max_sum=cur_sum;
          int j=0;
          for ( i=k;i<arr.length;i++){
              cur_sum+=arr[i] - arr[i - k];
              max_sum=Math.max(cur_sum,max_sum);
          }

            return max_sum;
        }

        // Driver code
        public static void main(String[] args)
        {
            int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
            int k = 4;
            int n = arr.length;
            System.out.println(maxSum(arr, n, k));
        }
    }

// This code is contributed by Aditya Kumar (adityakumar129)


