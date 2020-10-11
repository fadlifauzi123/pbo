package com.pboreg;

public class Overloading {
    static int plusMethodInt(){
        return 8 + 5;
    }
    static double plusMethodDouble(){
        return 4.3 + 6.26;
    }

    public static void main(String[] args) {
        int myNum1= plusMethodInt();
        double myNum2= plusMethodDouble();
        System.out.println("int: "+myNum1);
        System.out.println("double: "+myNum2);
    }
}
