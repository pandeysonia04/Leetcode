package org.example.ArrayOrString;

public class ZigZagConversion {
    public static void main(String[] args) {
        Solution s=new Solution();
        String result = s.convert("PAYPALISHIRING", 4);
        System.out.println(result);
    }
    static class Solution {
        public String convert(String s, int numRows) {
            String result="";
            if(numRows == 1 || numRows >= s.length()) {
                return s;
            }
            for(int i=0; i<numRows; i++) {
                int increment = (numRows - 1) * 2;
                for(int j=i; j<s.length(); j+=increment){
                    result +=s.charAt(j);
                    if(i>0 && i<numRows-1 && (j + increment - 2 * i < s.length())) {
                        result += s.charAt(j + increment - 2 * i);
                    }
                }
            }
            
            return result;
        }
        }
}
