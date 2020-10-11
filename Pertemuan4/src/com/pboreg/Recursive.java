package com.pboreg;
import java.util.*;
public class Recursive {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai= userInput.nextInt();
        System.out.println("Anda memasukkan nilai: "+ nilai);

        printNilai(nilai);
        System.out.println("========");
        int jumlah= jumlahNilai(nilai);
        System.out.println("Jumlah: "+ jumlah);
        System.out.println("========");
        int faktorial= hitungFaktorial(nilai);
        System.out.println("Faktorial: "+ faktorial);
    }
    private static int hitungFaktorial(int parameter){
        System.out.println("Parameter: "+ parameter);
        if(parameter==1){
            return parameter;
        }
        return parameter*hitungFaktorial(parameter-1);
    }
    private static int jumlahNilai(int parameter){
        System.out.println("Parameter: "+ parameter);
        if(parameter==0){
            return parameter;
        }
        return parameter+jumlahNilai(parameter-1);
    }
    private static void printNilai(int parameter){
        System.out.println("nilai: "+ parameter);
        if (parameter==0){
            return;
        }
        parameter --;
        printNilai(parameter);
    }
}
