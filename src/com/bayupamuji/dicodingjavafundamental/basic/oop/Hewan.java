package com.bayupamuji.dicodingjavafundamental.basic.oop;

public class Hewan {
    private String name;
    private int jmlKaki;
    private int berat;

    public Hewan(String name){
        this.name = name;
    }

    public void setBerat(int berat){
        this.berat = berat;
    }

    public void setJmlKaki(int jmlKaki){
        this.jmlKaki = jmlKaki;
    }

    public void printHewan(){
        System.out.println("Nama hewan : "+name);
        System.out.println("Berat hewan : "+berat);
        System.out.println("Jml Kaki hewan : "+jmlKaki);
    }
}
