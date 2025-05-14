package org.DSA.DP;

import org.DSA.HashMap.HashFunctions;

public class Fibonacci {
    public static void main(String[] args) {
        HashFunctions<Integer,Long> hf = new HashFunctions<>();
        System.out.println(fibonacci(100, hf));
    }

    private static long fibonacci(int i,HashFunctions<Integer,Long> hf) {
        if (hf.get(i)!=null)
            return (long) hf.get(i);
        if (i<=2)
            return 1;
        else {
            long result = fibonacci(i - 1, hf) + fibonacci(i - 2, hf);

            // Store the computed Fibonacci number in cache
            hf.put(i, result);
            return result;}

    }
}
