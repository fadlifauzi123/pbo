package com.pboreg;

public class MultipleParameter {
    static void myMethod(String fname, int age){
        System.out.println(fname+" is "+age);
    }

    public static void main(String[] args) {
        myMethod("Liam",5);
        myMethod("jenny",8);
        myMethod("Anya",31);
    }
}
