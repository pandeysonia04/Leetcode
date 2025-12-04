package org.example.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
    public static void main(String[] args) {
    Solution solution = new Solution();
    List<List<String>> resultSet=solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    System.out.print(resultSet);

    }
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> ans = new HashMap<>();
            for(String s:strs){
                int[] count = new int[26];

                //Count frequency of each letter in the String
                for(char c: s.toCharArray()){
                    count[c-'a']++;
                }
                StringBuilder str=new StringBuilder();
                for(int num:count){
                    str.append(num).append("#");
                }
                String key=str.toString();
                if(!ans.containsKey(key)){
                    ans.put(key,new ArrayList<>());
                }
                ans.get(key).add(s);
            }

            return new ArrayList<>(ans.values());
        }
        }
}