package org.Test;

public class SixPalendrome {
        public static void main(String[] args) {
            for (int a = 1; a <= 9; a++) {
                for (int b = 0; b <= 9; b++) {
                    for (int c = 0; c <= 9; c++) {
                        String palindrome = "" + a + b + c + c + b + a;
                        System.out.println(palindrome);
                    }
                }
            }
        }
}
