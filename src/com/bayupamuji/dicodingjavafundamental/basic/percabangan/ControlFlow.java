package com.bayupamuji.dicodingjavafundamental.basic.percabangan;

public class ControlFlow {
    public static void printResult() {
        tryifelse();
        tryswitch();
        trySwitchNoBreak();
    }

    private static void trySwitchNoBreak() {
        char pilihan = 'B';
        int value = 0;
        switch (pilihan) {
            case 'A':
                value++;
            case 'B':
                value++;
            case 'C':
                value++;
            default:
                value++;

        }
        System.out.println("nilai : " + value);
    }

    private static void tryswitch() {
        int pilihan = 4;
        switch (pilihan) {
            case 1:
                System.out.println("hei kamu pilih 1");
                break;
            case 2:
                System.out.println("hei kamu pilih 2");
                break;
            case 3:
                System.out.println("hei kamu pilih 3");
                break;
            default:
                System.out.println("pilihan kamu tidak ada");
        }
    }

    private static void tryifelse() {
        int nilaiUjian = 45;
        char indexPrestasi = 'A';

        if (nilaiUjian >= 80) {
            indexPrestasi = 'A';
        } else if (nilaiUjian >= 70) {
            indexPrestasi = 'B';
        } else if (nilaiUjian >= 60) {
            indexPrestasi = 'C';
        } else if (nilaiUjian >= 50) {
            indexPrestasi = 'D';
        } else {
            indexPrestasi = 'E';
        }
        System.out.println("Nilai index prestasi anda " + indexPrestasi);
    }
}
