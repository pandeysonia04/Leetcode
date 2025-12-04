package org.example.TwoPointers;


public class IsSubsequenceMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("abc", "ahbgdc"));
    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {
            int curr_ptr=0;
            for(int i=0; i<t.length(); i++){
                if(t.charAt(i)==s.charAt(curr_ptr)){
                    curr_ptr++;
                }
            }
            if(curr_ptr==s.length()-1){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
