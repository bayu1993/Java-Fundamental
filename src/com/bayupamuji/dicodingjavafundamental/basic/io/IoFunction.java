package com.bayupamuji.dicodingjavafundamental.basic.io;

import java.util.Scanner;

public class IoFunction {
    public static void ioFunction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Percobaan Input menggunakan Scanner");
        System.out.println("Massukkan angka pertama :");
        int value1 = scanner.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int value2 = scanner.nextInt();

        System.out.println("angka yang anda masukkan adalah nilai pertama : "+value1
                + " dan nilai kedua : "+value2);
    }
}
