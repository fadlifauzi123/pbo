package com.pboreg;

public class Scope {
    public static void main(String[] args) {
        //Code here cannot use X

        {//This is a block

            //Code here cannot use X

            int x = 100;

            //Code here can use X
            System.out.println(x);

        }//The block ends here

        //Code here cannot use X
    }
}
