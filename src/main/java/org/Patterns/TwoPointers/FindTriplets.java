package org.Patterns.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an integer array nums,
//return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
public class FindTriplets {
            public static List<List<Integer>> threeSum(int[] nums) {
               List<List<Integer>> list=new ArrayList<>();
               Arrays.sort(nums);
               for (int i=0;i< nums.length-2;i++){
                   if (i > 0 && nums[i] == nums[i - 1]) {
                       continue;
                   }
                   int l=i+1;
                   int r= nums.length-1;

                   while(l<r){
                       int sum=nums[i]+nums[l]+nums[r];
                       if (sum==0){
                           list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                           l++;
                           while(l<r&&nums[l]==nums[l-1])
                               l++;
                       }
                       else if(sum<0)
                           l++;
                       else
                           r--;
                   }
               }
                return list;
            }

        public static void main(String[] args) {
        int[] nums ={-1,0,1,2,-1,-4,-1,-1,-4};
        List<List<Integer>> result = threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

}
