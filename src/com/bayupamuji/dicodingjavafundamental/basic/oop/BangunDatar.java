package com.bayupamuji.dicodingjavafundamental.basic.oop;

public class BangunDatar {
    public void getLuas() {
        double p = 6;
        double l = 2;
        double luas = hitungLuas(p, l);
        System.out.println("panjang : " + p + " lebar : " + l);
        System.out.println("hasil : " + luas);

        double s = 5;
        luas = hitungLuas(s);
        System.out.println("sisi : "+s);
        System.out.println("hasil : "+luas);
    }

    private double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    private double hitungLuas(double s) {
        return s*s;
    }
}
