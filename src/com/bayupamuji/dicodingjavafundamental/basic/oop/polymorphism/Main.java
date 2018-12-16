package com.bayupamuji.dicodingjavafundamental.basic.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Object object = new Kucing(); // kucing adalah object
        Hewan hewan = new Kucing(); // kucing adalah hewan
        Kucing kucing = new Kucing(); // kucing adalah kucing

        //((Kucing) object).makan();
        hewan.makan();
        kucing.makan();

        //bisa langsung diassign
        Object object1 = kucing;
        Hewan hewan1 = kucing;

        hewan1.makan();

        //tidak bisa langsung diassign harus di casting dulu
        Kucing kucing1 = (Kucing) hewan1;
        kucing1.makan();

        // error ClassCastException krn casting hanya dapat dilakukan oleh class spesifik ke umum tidak sebaliknya
        /*Hewan hewan2 = new Hewan();
        Kucing anggora = (Kucing) hewan2;
        anggora.makan();*/
    }
}
