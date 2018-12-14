package com.bayupamuji.dicodingjavafundamental.basic.operator;

public class UnaryOperator {
    private int value, result;
    private boolean status;

    public static void getResults() {
        UnaryOperator unary = new UnaryOperator();
        unary.unaryPositif();
        unary.unaryMinus();
        unary.add();
        unary.minus();
        unary.complement();
    }

    private void unaryPositif() {
        value = 5;
        result = +value;
        System.out.println("hasil penambahan dari nilai awal = " + result);
    }

    private void unaryMinus() {
        value = 5;
        result = -value;
        System.out.println("hasil pengurangan dari nilai awal = " + result);
    }

    private void add() {
        result = 5;
        result++;
        System.out.println("hasil peningkatan 1 poin = " + result);
    }

    private void minus() {
        result = 5;
        result--;
        System.out.println("hasil pengurangan 1 poin = " + result);
    }

    private void complement() {
        boolean results = !status;
        System.out.println("status = " + status + " complement status = " + results);
    }

}
