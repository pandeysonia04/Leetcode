package org.example.ArrayOrString;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.strStr("hello", "ll");
        System.out.println(result); // Output: 2
    }
    static class Solution {
        public int strStr(String haystack, String needle) {
           if(haystack.length()< needle.length()) {
               return -1;
           }
           for(int i=0; i<haystack.length()-needle.length(); i++){
               if(haystack.substring(i, i+needle.length()).equals(needle)){
                   return i;
               }
           }
            return -1;
        }
        }
}
