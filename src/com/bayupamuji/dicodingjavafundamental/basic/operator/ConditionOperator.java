package com.bayupamuji.dicodingjavafundamental.basic.operator;

public class ConditionOperator {
    public static void getResult(){
        int a = 9;
        int b = 15;
        boolean statusA;
        boolean statusB;
        boolean statusC;
        boolean statusD;
        // syarat kondisi a >= 3 dan b =15
        statusA = a>3 && b==15;
        statusB = a<4 && b>10;
        statusC = a>3 || b==15;
        statusD = a<4 || b>10;
        System.out.println("nilai a : "+a+" nilai b : "+b);
        System.out.println("Syarat kondisi a>3 dan b==15 "+statusA);
        System.out.println("Syarat kondisi a<4 dan b>10 "+statusB);
        System.out.println("Syarat kondisi a>3 atau b==15 "+statusC);
        System.out.println("Syarat kondisi a<4 atau b>10 "+statusD);
    }
}
