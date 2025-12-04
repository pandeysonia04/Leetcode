package org.example.HashMap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
    Solution solution = new Solution();
    boolean value =solution.isIsomorphic("egg", "add");
    System.out.print(value);
    }
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Integer> sMap= new HashMap<>();
            HashMap<Character, Integer> tMap = new HashMap<>();
            for(int i=0; i<s.length(); i++){
                if(!sMap.containsKey(s.charAt(i))){
                    sMap.put(s.charAt(i), i);
                }
                if(!tMap.containsKey(t.charAt(i))){
                    tMap.put(t.charAt(i), i);
                }
                if(!sMap.get(s.charAt(i)).equals(tMap.get(t.charAt(i)))){
                    return false;
                }
            }
            return true;
        }
        }
}
