package com.bayupamuji.dicodingjavafundamental.basic.looping;

public class Looping {
    public static void tryLooping(){
        tryFor();
        tryNestedFor();
        tryWhile();
        tryDoWhile();
    }

    private static void tryDoWhile() {
        int a = 5;
        do {
            System.out.println("(do while) nilai : "+a);
            a--;
        }while (a>=1);
    }

    private static void tryWhile() {
        int a = 5;
        while (a>=1){
            System.out.println("(while) nilai : "+a);
            a--;
        }
    }

    private static void tryNestedFor() {
        int a = 5;
        for (int b=0;b<=a;b++){
            for (int c=0;c<=b;c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void tryFor() {
        for (int a=0;a<3;a++){
            System.out.println("hello java");
        }
        for (int a=0;a<=10;a++){
            System.out.println("(for) nilai : "+a);
        }
    }
}
