package com.pboreg;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Pelajar objk= new Pelajar();
        System.out.println("Nama: " + objk.tampilkanNama());
        System.out.println("NIM: " + objk.tampilkanNIM());
        System.out.println("Jurusan: " + objk.tampilkanJurusan());
        System.out.println("IPK: " + objk.tampilkanIPK());
        System.out.println("Umur: " + objk.tampilkanUmur());
    }
}
