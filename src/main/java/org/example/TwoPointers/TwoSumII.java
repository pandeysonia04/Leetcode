package org.example.TwoPointers;

public class TwoSumII {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9); // Output: [2, 7]
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        
    }
    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left=0;
            int right=numbers.length-1;
            while(left<right){
                int sum = numbers[left] + numbers[right];
                if(sum==target)
                    return new int[]{numbers[left], numbers[right]};
                else if(sum<target){
                    left++;
                } else {
                    right--;
                }
            }
            return new int[]{-1, -1};
        }
        }
}
