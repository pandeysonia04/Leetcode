package org.example.SlidingWindow;

public class MinWindowSubstring {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s=solution.minWindow("ADOBECODEBANC", "ABC");
        System.out.print(s);
    }
    static class Solution {
        public String minWindow(String s, String t) {
            if(s.length()<t.length() || t.length()==0 || s.length()==0) {
                return "";
            }
            int[] map =new int[128];
            int count = t.length();
            int left=0, right = 0, minLenWindow=Integer.MAX_VALUE, start_index=0;
            for(char c: t.toCharArray()){
                map[c]++;
            }
            char[] charS=s.toCharArray();
            while(right<charS.length){
                if(map[charS[right++]]-->0){
                    count--;
                }
                while(count==0){
                    if(right-left<minLenWindow){
                        start_index=left;
                        minLenWindow=right-left;
                    }
                    if(map[charS[left++]]++ ==0){
                        count++;
                    }
                }
            }
            return minLenWindow == Integer.MAX_VALUE ? new String():new String(charS, start_index, minLenWindow);

        }
    }
}
