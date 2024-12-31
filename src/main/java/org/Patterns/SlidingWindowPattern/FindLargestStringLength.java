package org.Patterns.SlidingWindowPattern;

import org.Java8.Student;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
//import org.Java8.Student;
//Given a string s, find the length of the longest
//substring
// without repeating characters.
public class FindLargestStringLength {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("org.Patterns.SlidingWindowPattern.FindLargestStringLength");
       Method[] m= c.getDeclaredMethods();
        for (Method method: m){
            System.out.println(method);
        }

        String s = "abcabcbb";
        System.out.println(find(s));
    }

//    private static int find(String s) {
//        int max = Integer.MIN_VALUE;
//        Set set = new HashSet();
//        int l = 0;
//        int r = 1;
//        set.add(s.charAt(0));
//        max=1;
//        while (l != r) {
//            if (!set.contains(s.charAt(r))) {
//                set.add(s.charAt(r));
//                max = Math.max(max, r - l + 1);
//                r++;
//            } else {
//                set.remove(s.charAt(l));
//         //       max = Math.max(max, r - l + 1);
//                l++;
//            }
//        }
//        return max;
//    }
    private static int find(String s) {
        Map<Character, Integer> m = new HashMap();

      //  m.put(s.charAt(0), 0);
        int max = 0;
        for (int r=0,l=0; r < s.length(); r++) {
            if (!m.containsKey(s.charAt(r))) {
                m.put(s.charAt(r), r);
                max=Math.max(max, r-l+1);
            }
            else{
                if (m.get(s.charAt(r))>=l)
                l=m.get(s.charAt(r))+1;
            }
        }
        return max;
    }
}
