package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer ans = 0;
        for (Object ele:objectArray) {
            if(ele.equals(objectToCount)){
                ans++;
            }
        }
        return ans;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Object[] objectArray, Object objectToRemove) {
        int counter = 0;
        for (Object ele: objectArray) {
            if(!ele.equals(objectToRemove)){
                counter++;
            }
        }
        Integer[] ans = new Integer[counter];
        int stepper = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if(!objectArray[i].equals(objectToRemove)){
                ans[stepper] = (Integer)objectArray[i];
                stepper++;
            }
        }
        return ans;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 1,tempCount;
        Object mostCommon = objectArray[0];
        for (int i = 0; i <objectArray.length-1 ; i++) {
            Object commonChecked = objectArray[i];
            tempCount = 0;
            for(int j = 1; j <objectArray.length;j++){
                if(commonChecked.equals(objectArray[j])){
                    tempCount++;
                }
                if(tempCount>count){
                    mostCommon = commonChecked;
                    count= tempCount;
                }
            }
        }



        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int count = 10,tempCount;
        Object leastCommon = objectArray[0];
        for (int i = 0; i <objectArray.length-1 ; i++) {
            Object commonChecked = objectArray[i];
            tempCount = 0;
            for(int j = 0; j < objectArray.length;j++){
                if(commonChecked.equals(objectArray[j])){
                    tempCount++;
                }
                if(tempCount<count){
                    leastCommon = commonChecked;
                    count= tempCount;
                }
            }
        }



        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int counter = 0;
        Integer[] ans = new Integer[objectArray.length + objectArrayToAdd.length];

        for (Object ele: objectArray) {
            ans[counter] = (Integer)ele;
            counter++;
        }
        for (Object ele: objectArrayToAdd) {
            ans[counter] = (Integer)ele;
            counter++;
        }

        return ans;
    }
}
