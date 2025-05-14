package org.Patterns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TargetSumOrNearest {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 29, 33};
        int target = 40;

        int[] result = new int[2];
        result = findpair(arr, target);
        System.out.print(result[0]+" "+result[1]);
    }

    private static int[] findpair(int[] arr, int target) {
        int[] result = new int[2];
        Set s = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = target - arr[i];
            if (s.contains(sum)) {
                result[0]=arr[i];
                result[1]=sum;
            }
            else {
                if (target-sum<min_diff&&target-sum>0){
                    min_diff=sum;
                    result[0]=arr[i];
                    result[1]=(target-arr[i])-min_diff;
                }
                else continue;
            }
            }
        return result;

        }

}
