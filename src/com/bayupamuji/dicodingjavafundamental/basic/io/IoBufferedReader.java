package com.bayupamuji.dicodingjavafundamental.basic.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class IoBufferedReader {
    public static void userBufferedReader() {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        int value1 = 0;
        int value2 = 0;
        System.out.println("IO menggunakan Buffered Reader");
        try {
            System.out.println("Masukkan angka pertama : ");
            value1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Masukkan angka kedua : ");
            value2 = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("angka pertama : "+value1+ "angka kedua : "+value2);
    }
}
