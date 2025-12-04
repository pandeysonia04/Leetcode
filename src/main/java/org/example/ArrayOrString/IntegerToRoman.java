package org.example.ArrayOrString;

public class IntegerToRoman {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(1994));
    }
    static class Solution {
        public String intToRoman(int num) {
            String roman= "";
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] s= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            for(int i=0; i<values.length; i++){
                while(num>=values[i]){
                    roman+=s[i];
                    num-=values[i];
                }
            }
            return roman;
        }
    }
}

