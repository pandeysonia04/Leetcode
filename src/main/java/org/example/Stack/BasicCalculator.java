package org.example.Stack;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.calculate("(1+(4+5+2)-3)+(6+8)");
    }
    static class Solution {
        public int calculate(String s) {
            int result=0;
            int number=0;
            int sign=1;
            Stack<Integer> stack= new Stack<>();
            for(int i=0; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    number = number*10 + (s.charAt(i)-'0');

                }
                else if(s.charAt(i) == '+'){
                    result += (sign*number);
                    number = 0;
                    sign = 1;
                }
                else if(s.charAt(i) == '-'){
                    result += (sign*number);
                    number = 0;
                    sign = -1;
                }
                else if(s.charAt(i) == '('){
                    stack.push(result);
                    stack.push(sign);
                    result=0;
                    number=0;
                    sign=1;
                }
                else if(s.charAt(i) == ')'){
                    result += (sign*number);
                    number=0;
                    int stack_sign = stack.peek(); stack.pop();
                    int last_result = stack.peek(); stack.pop();
                    result *= stack_sign;
                    result += last_result;
                }
            }
            result += (sign*number);
            return result;
        }
    }
}
