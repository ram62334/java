package org.DSA.DP;

import org.DSA.HashMap.HashFunctions;
import org.example.Main;

//Given a m*n grid find the number of steps taken from top left corner A to B in bottom right
//note:should not move in diagonal(m-1),(n-1)
public class Grid {
    public static void main(String[] args) {
        HashFunctions<String, Long> hf = new HashFunctions<>();
        int m=2;
        int n=3;
        System.out.println(findPath(m,n,hf));
    }

// time comlexity without memoisation is n+m->height of the tree and O() is 2^n+m and space complexity is m+n
//    time complexity after memoisation is O(m+m) and space complexity is m*n
    private static Long findPath(int m,int n,HashFunctions<String, Long> hf) {
        if ((m==0||n==0))
            return 0L;
        if (m==1||n==0)
            return 1L;
        String key=m+","+n;
        if (hf.get(key)!=null) return (Long) hf.get(key);
        else {
            Long val = findPath(m - 1, n, hf) + findPath(m, n - 1, hf);
            hf.put(key, val);
        }
            return (Long) hf.get(key);
    }
}
