package com.pboreg;

abstract class Hewan{
    //Membuat abstract
    public abstract void suaraHewan();

    //regular method
    public void tidur(){
        System.out.println("zzz...");
    }
}
//inheritage turunan dari class abstract hewan
class Ayam extends Hewan{
    //regular method
    public void suaraHewan(){
        System.out.println("Kukuruyuk...");
    }
}
//inheritage class abstract hewan
class Kucing extends Hewan{
    public void suaraHewan(){
        System.out.println("Meong Meong...");
    }
}
public class Main {

    public static void main(String[] args) {
	    Ayam myAyam= new Ayam();
	    myAyam.suaraHewan();
	    myAyam.tidur();
        System.out.println("==========");
	    Kucing myKucing= new Kucing();
	    myKucing.suaraHewan();
	    myKucing.tidur();
    }
}
