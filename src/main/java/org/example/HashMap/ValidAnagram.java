package org.example.HashMap;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean status=solution.isAnagram("anagram", "anagram");
        System.out.println(status);

    }
    static class Solution {
        public boolean isAnagram(String s, String t) {
            HashMap<Character, Integer> sMap = new HashMap<>();
            for(int i=0; i<s.length(); i++){
                sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0; i<t.length(); i++){
                if(sMap.containsKey(t.charAt(i)) && sMap.get(t.charAt(i))==0){
                    return false;
                }
                sMap.put(t.charAt(i), sMap.get(t.charAt(i))-1);
            }
            return true;
        }
        }
}
