package org.example.HashMap;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
    Solution solution = new Solution();
    boolean value=solution.canConstruct("aa", "aab");
    System.out.print(value);
    }
    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> magazineMap = new HashMap<>();
            for(char c: magazine.toCharArray()){
                magazineMap.put(c, magazineMap.getOrDefault(c,0)+1);
            }
            for(char r: ransomNote.toCharArray()){
                if(!magazineMap.containsKey(r) || magazineMap.get(r)==0)
                    return false;
                magazineMap.put(r, magazineMap.get(r)-1);
            }
            return true;
        }
        }
}
