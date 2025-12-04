package org.example.HashMap;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isHappy(19);
        System.out.print(result);
    }
    static class Solution {

        public boolean isHappy(int n) {
            HashSet<Integer> happYNumbers = new HashSet<>();
            while(n!=1){
                if(happYNumbers.contains(n))
                    return false;

                happYNumbers.add(n);
                n=calculateSumofSquares(n);

            }
            return true;
        }
        public int calculateSumofSquares(int n){
            int sum=0;
            while (n>0){
                int digit = n%10;
                sum+=digit*digit;
                n/=10;
            }
            return sum;
        }
        }
}
