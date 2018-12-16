package com.bayupamuji.dicodingjavafundamental.basic.oop.inheritance;

public class Kucing extends Hewan {
    String ras, habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    //overidding
    @Override
    public void makan() {
        System.out.println("kucing juga butuh makan");
    }

    //overloading
    public void makan(String makanan) {
        System.out.println("Kucing makan " + makanan);
    }

    @Override
    public String toString() {
        return "Kucing ras : " + ras + " , habitat : " + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing) {
            Kucing other = (Kucing) obj;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }
}
