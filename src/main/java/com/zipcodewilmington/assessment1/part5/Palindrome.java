package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer ans=input.length();
       int counter= 0;
        for (int i = 0; i < input.length() ; i++) {
            if(input.charAt(i) == input.charAt(i+1) && i<input.length()){
                counter++;

            }
            if(i>0 && input.charAt(i)==input.charAt(i-1)){
                counter++;
            }
        }


        return ans;
    }
}
