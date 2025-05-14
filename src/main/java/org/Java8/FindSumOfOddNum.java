package org.Java8;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindSumOfOddNum {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(2);
        l.add(4);
        l.add(3);
        l.add(6);
        l.add(5);

        int sum=0;

            sum=l.stream().filter(x -> x%2!=0).mapToInt(Integer::intValue).sum();
            System.out.print(sum);
    }
}
