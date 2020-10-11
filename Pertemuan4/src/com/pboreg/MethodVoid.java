package com.pboreg;

public class MethodVoid {
    public static void main(String[] args) {
        System.out.println(simpel());
        fungsiVoid("apa pun");
        selamatPagi("fadli");
    }
    private static void selamatPagi(String nama) {
        System.out.println("selamat pagi "+ nama);
    }
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    private static float simpel(){
        return 10.0f;
    }
}
