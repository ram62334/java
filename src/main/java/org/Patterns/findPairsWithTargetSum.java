package org.Patterns;

import java.util.HashSet;
import java.util.Set;

public class findPairsWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 7, 5, 3};
        int target = 8;
        findPairsWithTargetSum(arr, target);
}
    public static void findPairsWithTargetSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
            }
            seen.add(num);
        }
    }
}
