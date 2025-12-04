package org.example.TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
//        String newString="";
//        for(int i=s.length()-1; i>=0; i--){
//            newString+=s.charAt(i);
//        }
//        if(newString.equalsIgnoreCase(s)){
//            return true;
//        }
//        return false;
        int first=0;
        int last=s.length()-1;
        while(first<=last){

            if(s.charAt(first)==s.charAt(last)){
                first++;
                last--;
            }
            else{
                return false;
            }
        }
        return true;

    }

}
