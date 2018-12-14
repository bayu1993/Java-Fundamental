package com.bayupamuji.dicodingjavafundamental.basic.operator;

public class AritmatikaOperator {
    private int a, b, result;

    public static void printResult() {
        AritmatikaOperator aritmatikaOperator = new AritmatikaOperator();
        aritmatikaOperator.add();
        aritmatikaOperator.subtract();
        aritmatikaOperator.multiple();
        aritmatikaOperator.divider();
        aritmatikaOperator.modulus();
    }

    private void add() {
        a = 1;
        b = 3;
        result = a + b;
        System.out.println("Hasil penjumlahan " + a + " + " + b + " : " + result);
    }

    private void subtract() {
        a = 1;
        b = 3;
        result = a - b;
        System.out.println("Hasil penjumlahan " + a + " - " + b + " : " + result);
    }

    private void multiple() {
        a = 1;
        b = 3;
        result = a * b;
        System.out.println("Hasil penjumlahan " + a + " x " + b + " : " + result);
    }

    private void divider() {
        a = 1;
        b = 3;
        float results = (float) a / b;
        System.out.println("Hasil penjumlahan " + a + " / " + b + " : " + results);
    }

    private void modulus() {
        a = 1;
        b = 3;
        result = a % b;
        System.out.println("Hasil penjumlahan " + a + " % " + b + " : " + result);
    }

}
