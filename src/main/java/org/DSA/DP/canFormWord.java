package org.DSA.DP;

import org.DSA.HashMap.HashFunctions;

//Given a target word 'abcdef' and word bank array["a","b","abc","ef","d"] find if target can be formed
public class canFormWord {
    public static void main(String[] args) {
        String target = "abcdef";
        String[] bank = {"a","b","abc","ef","d"};
        HashFunctions<String,Boolean> hf = new HashFunctions<>();

        System.out.print(find(target, bank, hf));
    }

    private static boolean find(String target, String[] bank, HashFunctions<String, Boolean> hf) {
        if (target.isEmpty()) return true;
        if (hf.get(target)!=null)
            return hf.get(target);

        for (String word: bank){
            if (target.startsWith(word)){
                String str = target.substring(word.length());
                if (find(str, bank, hf)==true){
                    hf.put(target, true);
                    return true;
                }
            }
        }
        return false;
    }
}
