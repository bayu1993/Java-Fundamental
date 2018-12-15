package com.bayupamuji.dicodingjavafundamental.basic;

import com.bayupamuji.dicodingjavafundamental.basic.oop.BangunDatar;
import com.bayupamuji.dicodingjavafundamental.basic.oop.HewanImpl;

public class Main {

    public static void main(String[] args) {

        /*System.out.println("Hello World!");
        Gitar.bunyi();
        Mobil.jmlBan();
        Kereta.jmlBan();
        Motor.jmlBan();

        Date today = new Date();
        System.out.println("Hari ini adalah hari "+today);
        Date tommorow = DateUtils.addDays(today,1);
        System.out.println("Besok adalah hari "+tommorow);*/

        HewanImpl kambing = new HewanImpl("Kambing");
        HewanImpl sapi = new HewanImpl("Sapi");
        BangunDatar bangunDatar = new BangunDatar();

        kambing.setBerat(56);
        kambing.setJmlKaki(4);
        kambing.printHewan();

        sapi.setBerat(180);
        sapi.setJmlKaki(4);
        sapi.printHewan();

        bangunDatar.getLuas();
    }
}
