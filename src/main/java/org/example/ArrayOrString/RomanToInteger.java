package org.example.ArrayOrString;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Solution s=new Solution();
        int result2=s.romanToInt("MCMXCIV");
        System.out.println(result2); // Output: 1994
    }
    static class Solution{
        public int romanToInt(String s) {
            Map<Character, Integer> roman = new HashMap<>();
            roman.put('I',1);
            roman.put('V',5);
            roman.put('X',10);
            roman.put('L',50);
            roman.put('C',100);
            roman.put('D',500);
            roman.put('M',1000);
            int result=roman.get(s.charAt(s.length()-1));
            for(int i=s.length()-2; i>=0; i--){
                if(roman.get(s.charAt(i))< roman.get(s.charAt(i+1))){
                    result-=roman.get(s.charAt(i));
                }
                else{
                    result+=roman.get(s.charAt(i));
                }
            }
            return result;
        }
    }
}
