package org.example.HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public static void main(String[] args) {
    Solution solution = new Solution();
    boolean result=solution.wordPattern("abba", "dog cat cat dog");
    System.out.print(result);
    }
    static class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] words= s.split(" ");
            if(pattern.length()!=words.length)
                return false;
            HashMap<Character,String> charToWordMapping = new HashMap<>();
            HashSet<String> seenWords = new HashSet<>();
            for(int i=0; i<pattern.length(); i++){
                char c = pattern.charAt(i);
                String word= words[i];
                if(charToWordMapping.containsKey(c)){
                    if(!charToWordMapping.get(c).equals(word)){
                        return false;
                    }
                }
                else{
                    if(seenWords.contains(word)){
                        return false;
                    }
                    charToWordMapping.put(c, word);
                    seenWords.add(word);
                }

            }
            return true;
        }
        }
}
