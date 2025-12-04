package org.example.TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
    Solution solution = new Solution();
    solution.maxArea(new int[]{1,2,1});
    }

     static class Solution {
        public int maxArea(int[] height) {
            int left=0;
            int maxcurrarr=0;
            int right=height.length-1;
            while (left < right){
                int area=0;
                if(height[left] < height[right]){
                    area = height[left] * height[left];
                    left++;
                }
                else{
                    area = height[right] * height[right];
                    left++;
                }
                if(area>maxcurrarr)
                    maxcurrarr=area;
            }
            return maxcurrarr;
        }
    }
}
