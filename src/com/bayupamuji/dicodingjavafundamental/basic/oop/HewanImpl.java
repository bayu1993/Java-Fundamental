package com.bayupamuji.dicodingjavafundamental.basic.oop;

public class HewanImpl implements HewanInterface{
    private String name;
    private int jmlKaki;
    private int berat;

    public HewanImpl(String name){
        this.name = name;
    }

    @Override
    public int setBerat(int berat) {
        return this.berat = berat;
    }

    @Override
    public int setJmlKaki(int jmlKaki) {
        return this.jmlKaki = jmlKaki;
    }

    @Override
    public void printHewan() {
        System.out.println("Nama hewan : "+name);
        System.out.println("Berat hewan : "+berat);
        System.out.println("Jml Kaki hewan : "+jmlKaki);
    }

    /*public int setBerat(int berat){
        return this.berat = berat;
    }

    public int setJmlKaki(int jmlKaki){
        return this.jmlKaki = jmlKaki;
    }

    public void printHewan(){
        System.out.println("Nama hewan : "+name);
        System.out.println("Berat hewan : "+berat);
        System.out.println("Jml Kaki hewan : "+jmlKaki);
    }*/
}
