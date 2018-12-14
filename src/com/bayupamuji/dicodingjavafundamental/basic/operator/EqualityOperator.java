package com.bayupamuji.dicodingjavafundamental.basic.operator;

public class EqualityOperator {
    public static void printResult() {

        int a = 18;
        int b = 9;
        boolean result;

        result = a == b;
        System.out.println("a :" + a + " b :" + b + " hasil a == b : " + result);
        result = a >= b;
        System.out.println("a :" + a + " b :" + b + " hasil a >= b : " + result);
        result = a <= b;
        System.out.println("a :" + a + " b :" + b + " hasil a <= b : " + result);
        result = a > b;
        System.out.println("a :" + a + " b :" + b + " hasil a > b : " + result);
        result = a < b;
        System.out.println("a :" + a + " b :" + b + " hasil a < b : " + result);
        result = a != b;
        System.out.println("a :" + a + " b :" + b + " hasil a != b : " + result);

    }
}
