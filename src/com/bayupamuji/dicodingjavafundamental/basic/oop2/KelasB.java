package com.bayupamuji.dicodingjavafundamental.basic.oop2;

import com.bayupamuji.dicodingjavafundamental.basic.oop.KelasA;

public class KelasB extends KelasA {
    @Override
    protected void functionC() {
        super.functionC();
        System.out.println("contoh pemanggilan function protected");
    }
}
