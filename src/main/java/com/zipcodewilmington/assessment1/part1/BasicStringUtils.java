package com.zipcodewilmington.assessment1.part1;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String ans = "";
        Character b = str.charAt(0);
        b = Character.toUpperCase(b);
        ans+=b;

        for (int i = 1; i < str.length(); i++) {
            ans+=str.charAt(i);
        }
        return ans;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String ans = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String ans = "";
        String ans1 = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            ans += str.charAt(i);
        }
        Character b = Character.toUpperCase(ans.charAt(0));
        ans1 +=b;
        for (int i = 1; i < ans.length(); i++) {
            ans1+=ans.charAt(i);
        }

        return ans1;

        }




    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String ans = "";
        for (int i = 0; i < str.length() ; i++) {
            Character charAtTime = ' ';
            charAtTime = str.charAt(i);
           Boolean c1 = Character.isUpperCase(charAtTime);
            if(c1==true){
               ans+= charAtTime.toString().toLowerCase();

            } else{
              ans+=  charAtTime.toString().toUpperCase();

            }
        }
        return ans;
    }
}
