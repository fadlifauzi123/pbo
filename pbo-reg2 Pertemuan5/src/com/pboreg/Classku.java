package com.pboreg;

class Classku {
    //Atribute
    public int x=5; //atribut ini tidak boleh diakses secara langsung di luar classku
    int y=15; //atribut ini dapat diakses secara langsung diluar classku dalam satu package
    private int z=20; //atribut ini tidak boleh diakses secara langsung di luar classku

    // Method
    public int tampilkanZ(){
        return this.z;
    }
}
