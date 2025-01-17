package org.Test;

public class Problems {
    public static void main(String[] args) {
//                String s = "elephant-tiger-lion-";
//
//                // Split the string using "-" as the delimiter
//                String[] animals = s.split("-",-1);
//
//                // Find the last non-empty element
//                String lastAnimal = animals[animals.length - 1];
//
//                // Calculate the length of the last animal
//                int length = lastAnimal.length();
//
//                // Print the result
//                System.out.println("Last animal: " + lastAnimal);
//                System.out.println("Length of last animal: " + length);
        int arr[] = {1,2,3,2};
        int result[] = findMissing(arr);
            }

    private static int[] findMissing(int[] arr) {
        int[] result =new int[2];
        int l=arr.length;
        int sum=0;
        sum=l*(l+1)/2;
        for (int i=0;i<arr.length-1;i++){
            sum-=arr[i];
        }

        result[0]=arr[arr.length-1];
        result[1]=sum;
        return result;
    }


}
