package org.example.Stack;

public class MinStackMain {
    public static void main(String[] args) {
        MinStack minStack= new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();
        minStack.getMin(); //return -2
    }
}
