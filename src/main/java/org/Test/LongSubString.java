package org.Test;

import java.util.HashSet;
import java.util.Set;

public class LongSubString {
    public static void main(String[] args) {
        String str="abcabcbb";
        Set<Character> s = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int i=0;
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;

        for ( i=0;i<str.length();i++){
            char st2=str.charAt(right);
            if (s.contains(st2)){
                if (sb.length()>max) {
                    max = sb.length();
                    result=sb;
                }
                left=str.length()-right;
                s.clear();
                sb.setLength(0);
            }
            else {
                sb.append(st2);
                s.add(st2);
                right++;
            }
        }
        System.out.print(result);
    }
}
