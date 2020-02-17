package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer ans = 0;
        for (int i = 0; i <=n ; i++) {
            ans+=i;
        }
        return ans;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer ans = 1;
        for (int i = 1; i <=n ; i++) {
            ans*=i;
        }
        return ans;
    }



    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
       String stringVal = val.toString();
       String ans = "";
        for (int i = stringVal.length()-1; i >= 0 ; i--) {
            ans+=stringVal.charAt(i);
        }
        Integer ans1 = Integer.parseInt(ans);
        return ans1;
    }
}
