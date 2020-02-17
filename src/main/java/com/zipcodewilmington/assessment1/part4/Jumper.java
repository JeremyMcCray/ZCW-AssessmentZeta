package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int ans;
        if(flagHeight == jumpHeight){
            return 1;
        } else if(jumpHeight>flagHeight){
            return flagHeight;
        } else if(flagHeight*flagHeight>jumpHeight){
          return jumpHeight+2;
        }

        return -1;
    }
}
