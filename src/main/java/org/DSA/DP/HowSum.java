package org.DSA.DP;

import org.DSA.HashMap.HashFunctions;

import java.util.ArrayList;
import java.util.List;

public class HowSum {
    public static List<Integer> howSum(Integer target, int[] numbers, HashFunctions<Integer,List<Integer>> hf) {
        if (hf.get(target)!=null) return hf.get(target);
        if (target == 0) return new ArrayList<>();  // Base case: exact sum found
        if (target < 0) return null;  // Base case: no solution

        for (int num : numbers) {
            int remainder = target - num;
            List<Integer> result = howSum(remainder, numbers, hf);
            if (result != null) {
                List<Integer> newResult = new ArrayList<>(result); // Create a copy
                newResult.add(num);
                hf.put(target, newResult);
                return newResult;
            }
        }
        hf.put(target, null);
        return null;
    }

    public static void main(String[] args) {
        HashFunctions<Integer, List<Integer>> hf=new HashFunctions<>();
        System.out.println(howSum(7, new int[]{2, 3}, hf));   // Output: [3, 2, 2] or any valid combination
        System.out.println(howSum(7, new int[]{5, 3, 4, 7}, hf)); // Output: [4, 3] or [7]
        System.out.println(howSum(300, new int[]{7,14},hf));  // Output: null
    }
}
