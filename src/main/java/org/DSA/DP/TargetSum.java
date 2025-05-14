package org.DSA.DP;

import org.DSA.HashMap.HashFunctions;

//given an array find if adding those elements will give target sum
//[2,3,4,7], target=7
//3+4=7
//7
//return true
public class TargetSum {
    public static void main(String[] args) {
        Integer[] arr = {5,3,2};
        Long target= 7L;
        HashFunctions<Long, Boolean> hf = new HashFunctions<>();
//        hf.put(target,false);
        System.out.print(find(target,arr,hf));
    }
//time complexity before memo is O(n^m)-n branches as n elements in array space is O(m)
//    After memo time complexity is O(m*n) and space is O(m)
    private static boolean find(Long i, Integer[] arr,HashFunctions<Long,Boolean> hf) {
        if (hf.get(i)!=null) return true;
        if (i==0) return true;
        if (i<=0) return false;

        for (int k=0;k<arr.length;k++){
            Long d= (i-arr[k]);
          if(find(d, arr,hf)==true) {
              hf.put(i, true);
              return true;
          }
        }
        return false;
    }
}
