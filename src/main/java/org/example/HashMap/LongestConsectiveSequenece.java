package org.example.HashMap;

import java.util.HashSet;

public class LongestConsectiveSequenece {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int longestSeq = solution.longestConsecutive(new int[]{100,4,200,1,3,2});
        System.out.print(longestSeq);
    }
        static class Solution {
            public int longestConsecutive(int[] nums) {
                HashSet<Integer> values = new HashSet<>();
                for(int i=0; i<nums.length; i++){
                    values.add(nums[i]);
                }
                int longestStreak = 0;
                for(int i:values){
                    if(!values.contains(i-1)){
                        int length = 1;
                        while(values.contains(i+length)){
                            length++;
                        }
                        longestStreak=Math.max(longestStreak,length);
                    }
                }

               return longestStreak;
            }
            }

}
