package com.pboreg;
import java.util.*;
public class Login {
    public static void main(String[] args) {
        String username;
        String password;
        String jawab;
        Scanner inputUser= new Scanner(System.in);
        System.out.print("Username mu: ");
        username= inputUser.next();
        System.out.print("Password mu: ");
        password= inputUser.next();

        if(username.equals("fadlifauzi") && (password.equals("syntynks"))){
            System.out.println("Selamat datang, "+username);
        }if(username.equals("aubameyang") && (password.equals("lacazette"))){
            System.out.println("Kamu siapa?");
            System.out.println("Mau ulang? [Ya] / [Tidak]");
            jawab= inputUser.next();

            if(jawab.equals("Ya")){
                while(!username.equals("fadlifauzi") && !password.equals("syntynks")){
                    System.out.print("Username mu: ");
                    username= inputUser.next();
                    System.out.print("Password mu: ");
                    password= inputUser.next();
                    System.out.println("Selamat Datang, "+username);
                }

            }else if(jawab.equals("Tidak")){
                System.out.println("Log Out");
            }else{
                System.out.println("Log Out");
            }

        }
    }
}
