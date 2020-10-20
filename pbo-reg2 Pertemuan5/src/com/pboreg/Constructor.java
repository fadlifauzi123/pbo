package com.pboreg;

// class dengan constructor
class Mahasiswa2{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    // constructor dengan parameter
    Mahasiswa2(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class Constructor {
    public static void main(String[] args){
        Mahasiswa2 mahasiswa1 = new Mahasiswa2("Hazard","2019071036","Teknik Ternak Lele"+ "\n");
        Mahasiswa2 mahasiswa2 = new Mahasiswa2("Benzema","2019071069","Teknik Kolam Ikan");
    }
}