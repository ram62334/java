package org.DSA.DP;

import java.util.ArrayList;
import java.util.List;

//Given a target print all the best combination[shortest] of number which adds upto target
public class BestSum {
    public static void main(String[] args) {
        int target=8;
        int[] comb ={2,3,5};
        System.out.println(find(target, comb));
    }

    private static List<Integer> find(int target, int[] comb) {
        if (target==0) return new ArrayList<>();
        if (target<0) return null;
        List<Integer> shortest = null;

        for (int i=0;i<comb.length;i++){
            int diff = target-comb[i];
            List<Integer> res = find(diff, comb);
            if (res!=null){
                List<Integer> newCombination = new ArrayList<>(res);
                newCombination.add(comb[i]);
                if (shortest==null||shortest.size()>newCombination.size()){
                    shortest = newCombination;
                }
            }
        }
        return shortest;
    }
}
