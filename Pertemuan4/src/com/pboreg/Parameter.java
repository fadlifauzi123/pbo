package com.pboreg;

public class Parameter {
    static void myMethod(String fname){
        System.out.println(fname+" Refsnes");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("jenny");
        myMethod("Anya");
    }
}
