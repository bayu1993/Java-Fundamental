package com.bayupamuji.dicodingjavafundamental.basic.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();

        System.out.println("Apakan hewan is a object : "+(hewan instanceof Object));
        System.out.println("Apakan hewan is a hewan : "+(hewan instanceof Hewan));
        System.out.println("Apakan hewan is a kucing : "+(hewan instanceof Kucing));
        hewan.makan();

        System.out.println("-------------------------------------------------------");

        Kucing kucingKampung = new Kucing("Kampung","Indonesia");
        Kucing kucingAnggora = new Kucing("Kampung","Malaysia");
        System.out.println("Apakah kucing is a object: "+(kucingKampung instanceof Object));
        System.out.println("Apakah kucing is a hewan: "+(kucingKampung instanceof Hewan));
        System.out.println("Apakah kucing is a kucing: "+(kucingKampung instanceof Kucing));

        kucingKampung.makan();
        kucingKampung.makan("bakso");

        System.out.println(kucingAnggora.toString());
        System.out.println(kucingKampung.toString());

        System.out.println("Kucing Kampung equals to Kucing Anggora ? "+kucingKampung.equals(kucingAnggora));
        System.out.println("Kucing Anggora equals to Kucing Kampung ? "+kucingAnggora.equals(kucingKampung));
    }
}
