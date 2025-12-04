package org.example.HashMap;

import java.util.HashMap;

public class CalculateDuplicateII {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2);
        System.out.print(result);
    }
    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> values = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                if(values.containsKey(nums[i])){
                   int targetValue = Math.abs(values.get(nums[i])-i);
                   if(targetValue <= k)
                       return true;
                }
                values.put(nums[i], i);
            }
            return false;
        }
    }
}
