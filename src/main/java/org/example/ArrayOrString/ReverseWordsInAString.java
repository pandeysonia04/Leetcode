package org.example.ArrayOrString;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.reverseWords("the sky is blue");
        System.out.println(result); // Output: "blue is sky
}
    static class Solution{
        public String reverseWords(String s) {
            String[] words = s.trim().split("\\s+");
            StringBuilder reversed = new StringBuilder();
            for(int i=words.length-1; i>0; i--){
                reversed.append(words[i]).append(" ");
            }
            return reversed.append(words[0]).toString();
        }
    }
}
