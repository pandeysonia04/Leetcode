package org.example.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result =solution.lengthOfLongestSubstring("abcabcbb"); // Example input
        System.out.print(result); // Output: 3
        
    }
    static class Solution{
        public int lengthOfLongestSubstring(String s){
            Set<Character> set = new HashSet<>();
            int maxLength = 0;
            int left = 0;
            for(int i=0; i<s.length(); i++){
                char currentChar = s.charAt(i);
                // If the character is already in the set, we need to remove characters from the left
                while(set.contains(currentChar)){
                    set.remove(s.charAt(left));
                    left++;
                }
                // Add the current character to the set
                set.add(currentChar);
                // Update the maximum length found so far
                maxLength = Math.max(maxLength, i - left + 1);
            }
            return maxLength;
        }
        
    }
}
