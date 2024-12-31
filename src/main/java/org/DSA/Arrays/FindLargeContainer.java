package org.DSA.Arrays;

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
public class FindLargeContainer {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int vol=0;
        System.out.println(maxArea(height, 0, height.length-1));
    }

    private static int maxArea(int[] height, int l, int r) {
        if (l>=r)
            return 0;
       int vol=Math.min(height[l], height[r]) * (r - l);

        //int maxvol = vol;

            if (height[l]<height[r])
                return Math.max(vol, maxArea(height, l+1, r));
            else
                return Math.max(vol, maxArea(height, l, r-1));

    }
}
