package com.pboreg;

public class MethodIfElse {
    static void checkAge(int age){
        if(age<18){
            System.out.println("Access Denied - You're not allowed to go in");
        }else{
            System.out.println("Access Granted - You're allowed to go in");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
