package com.bayupamuji.dicodingjavafundamental.basic;

import com.bayupamuji.dicodingjavafundamental.basic.io.IoFunction;
import com.bayupamuji.dicodingjavafundamental.basic.kendaraan.Kereta;
import com.bayupamuji.dicodingjavafundamental.basic.kendaraan.Mobil;
import com.bayupamuji.dicodingjavafundamental.basic.kendaraan.Motor;
import com.bayupamuji.dicodingjavafundamental.basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Gitar.bunyi();
        Mobil.jmlBan();
        Kereta.jmlBan();
        Motor.jmlBan();

        Date today = new Date();
        System.out.println("Hari ini adalah hari "+today);
        Date tommorow = DateUtils.addDays(today,1);
        System.out.println("Besok adalah hari "+tommorow);

        IoFunction.ioFunction();
    }
}
