package org.example.TwoPointers;

import java.util.*;

public class ThreeSumIII {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
           int left = i+1;
           int right = nums.length-1;
           while(left<right){
               int current_sum = nums[i] + nums[left] + nums[right];
               if(current_sum==0){
                   resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                   left++;
                   right--;
               }
               else if(current_sum>0){
                   right--;
               }
               else{
                   left--;
               }
           }
        }
        return new ArrayList<>(resultSet);
    }
}
