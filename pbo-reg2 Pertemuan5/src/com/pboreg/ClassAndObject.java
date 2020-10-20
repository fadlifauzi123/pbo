package com.pboreg;

//Class
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double ipk;
    int umur;
}
public class ClassAndObject {
    public static void main(String[] args) {
        //Object
        Mahasiswa mahasiswa1=new Mahasiswa();
        mahasiswa1.nama= "Hazard";
        mahasiswa1.NIM= "2019071036";
        mahasiswa1.jurusan= "Ternak Lele";
        mahasiswa1.ipk= 3.25;
        mahasiswa1.umur= 18;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur + "\n");

        Mahasiswa mahasiswa2=new Mahasiswa();
        mahasiswa2.nama= "Benzema";
        mahasiswa2.NIM= "2019071069";
        mahasiswa2.jurusan= "Teknik Kolam Ikan";
        mahasiswa2.ipk= 2.63;
        mahasiswa2.umur= 20;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.ipk);
        System.out.println(mahasiswa2.umur);
    }

}
