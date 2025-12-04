package org.example.ArrayOrString;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.lengthOfLastWord("Hello World");
        System.out.println(result); // Output: 5
    }
    static class Solution {
        public int lengthOfLastWord(String s) {
            if(s.trim().isEmpty()){
                return 0;
            }
            String[] words= s.trim().split(" ");
            if(words.length==0){
                return 0;
            }
            String lastWord = words[words.length - 1];
            return lastWord.length();
        }
    }
}
