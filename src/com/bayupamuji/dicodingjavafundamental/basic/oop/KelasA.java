package com.bayupamuji.dicodingjavafundamental.basic.oop;

public class KelasA {
    private int memberA = 5;

    char memberB = 'A';
    char memberC = 'C';
    private int functionA(){
        return memberA;
    }

    int functionB(){
        int result = memberA+functionA();
        return  result;
    }

    protected void functionC(){
        System.out.println("functionC is protected");
    }
}
