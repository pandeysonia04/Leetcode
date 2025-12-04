package org.example.ArrayOrString;

public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater.Solution solution = new TrappingRainWater.Solution();
        solution.trap(new int[]{4,2,3});
    }
    static class Solution {
        public int trap(int[] height) {
            int len=height.length;
            int left_index=0;
            int right_index=height.length -1;
            int maxleft=height[0];
            int maxright=height[len-1];
            int water=0;

            while(left_index<right_index){
                if (maxleft < maxright){
                    left_index++;
                    maxleft = Math.max(maxleft, height[left_index]);
                    water+=maxleft - height[left_index];
                }
                else{
                    right_index--;
                    maxright = Math.max(maxright, height[right_index]);
                    water+=maxright - height[right_index];
                }
            }
            return water;
        }
    }

}
