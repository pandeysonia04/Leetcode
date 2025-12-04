package org.example.SlidingWindow;

/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 *
 *
 *
 * Example 1:
 *
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * Example 2:
 *
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 *
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 104
 */

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        MinimumSizeSubarraySum.Solution solution = new MinimumSizeSubarraySum.Solution();
        solution.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
    }

    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int minLenWindow=Integer.MAX_VALUE;
            int currentSum=0;

            //start 2 pointers sliding window
            int low=0;
            int high=0;
            while(high<nums.length){
                //Find the current sum and increase the window
                currentSum += nums[high];
                high++;
                while(currentSum>=target){
                    int currwindowSize= high-low;
                    minLenWindow=Math.min(minLenWindow, currwindowSize);
                    currentSum-=nums[low];
                    low++;
                }
            }
            return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
        }
    }
}



