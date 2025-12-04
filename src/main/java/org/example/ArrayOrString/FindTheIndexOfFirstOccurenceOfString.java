package org.example.ArrayOrString;

public class FindTheIndexOfFirstOccurenceOfString {
    public static void main(String[] args) {
        FindTheIndexOfFirstOccurenceOfString findTheIndexOfFirstOccurenceOfString = new FindTheIndexOfFirstOccurenceOfString();
        int result = findTheIndexOfFirstOccurenceOfString.strStr("sadbutsad", "sad");
        System.out.println("Result :"+result);
    }
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        
        for(int i=0; i<=haystack.length()-needle.length(); i++)
        {
            if(haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}
