package org.example.ArrayOrString;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution s = new Solution();
        String longestPrefix = s.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(longestPrefix); // Output: "fl"
        
    }
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            String longestPrefix = "";
            if(strs == null || strs.length == 0) {
                return longestPrefix;
            }
            Arrays.sort(strs);
            char[] first = strs[0].toCharArray();
            char[] last = strs[strs.length - 1].toCharArray();
            for(int i=0; i<first.length; i++){
                if(i >= last.length || first[i] != last[i]) {
                    break;
                }
                if(first[i] == last[i])
                    longestPrefix += first[i];
            }
            return longestPrefix;
        }
    }
}
