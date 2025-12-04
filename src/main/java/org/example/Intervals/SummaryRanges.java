package org.example.Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        Solution solution = new Solution();
       List<String> result = solution.summaryRanges(new int[]{0,1,2,4,5,7});
       System.out.print(result.toString());
    }

    static class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> resultSet = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                int start = nums[i];
                while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                    i++;
                }
                //range calculation
                if(nums[i]==start){
                    resultSet.add(String.valueOf(start));
                }
                else{
                    resultSet.add(start +"->"+ nums[i]);
                }
            }
            return resultSet;
        }
    }
}
