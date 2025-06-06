package org.Patterns.Matrix;
//given n*n square matrix print the elements in spiral form
public class PrintSpiral {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printPattern(mat, mat.length, mat.length);
    }

    private static void printPattern(int[][] mat, int r, int c) {
        int i, k=0, l=0;
        while(k<r&&l<c){
            for (i=l;i<c;i++){
                System.out.print(mat[k][i]+" ");
            }
            k++;
            for (i=k;i<c;i++){
                System.out.print(mat[i][c-1]+" ");
            }
            c--;
            if (k<r) {
                for (i = c - 1; i >= l; i--) {
                    System.out.print(mat[r - 1][i] + " ");
                }
                r--;
            }
            if(l<c) {
                for (i = r - 1; i >= k; i--) {
                    System.out.print(mat[i][l] + " ");
                }
                l++;
            }
        }
    }
}
