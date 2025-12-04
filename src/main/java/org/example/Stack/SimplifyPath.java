package org.example.Stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.simplifyPath("/a/./b/../../c/");
        System.out.println(result);
    }
    static class Solution {
        public String simplifyPath(String path) {
            String[] pathComponents = path.split("/");
            Stack<String> stack = new Stack<>();
            for(String component: pathComponents){
                if(component.equals("") || component.equals("."))
                    continue;
                if(component.equals("..")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }
                else{
                    stack.push(component);
                }
            }
            StringBuilder stringBuilder=new StringBuilder();
            while(!stack.isEmpty()){
                stringBuilder.insert(0, "/" + stack.pop());
            }
        return stringBuilder.length()==0?"/":stringBuilder.toString();
        }
    }
}
