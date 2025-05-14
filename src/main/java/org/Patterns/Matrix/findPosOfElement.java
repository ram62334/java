package org.Patterns.Matrix;
//in a given sorted matrix (row and column) return the position of the element
public class findPosOfElement {
    public static void main(String[] args) {
        int[][] matrix = {
                            {10,20,30},
                            {15,25,35},
                            {27,29,37},
                            {32,33,39}
                        };
        find(matrix, matrix.length, 32);
    }

    private static void find(int[][] matrix, int n, int key) {
//        initialize two pointers and start from top right corner
        int i=0;
        int j=matrix[0].length-1;

        while(i<n&&j>=0){
            if (matrix[i][j]==key) {
                System.out.print(i + "," + j);
                return;
            }
//if key is greater than matrix[i][j] move i downwads else move j left wards
            if (key>matrix[i][j])
                i++;
            else j--;
        }

        System.out.print("not found");
    }
}
