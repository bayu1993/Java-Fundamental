package com.bayupamuji.dicodingjavafundamental.basic.oop;

import com.bayupamuji.dicodingjavafundamental.basic.oop2.KelasB;

public class Main extends KelasB{
    public static void main(String[] args) {
        Main main = new Main();
        KelasA kelasA = new KelasA();

        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
        System.out.println(kelasA.functionB());

        main.functionC();
    }
}
