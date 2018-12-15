package com.bayupamuji.dicodingjavafundamental.basic.array;

public class TryArray {
    public static void getResult(){
        tryArray();
        tryLoopingArray();
        tryDimensiArray();
    }

    private static void tryDimensiArray() {
        char array[][] = new char[2][];
        array[0] = new char[2];
        array[1] = new char[3];

        array[0][0] = 'A';
        array[0][1] = 'B';

        array[1][0] = 'C';
        array[1][1] = 'D';
        array[1][2] = 'E';

        System.out.println("Dimensi 1 dengan index 0 dan dimensi 2 dengan index 0: "+array[0][0]);
        System.out.println("Dimensi 1 dengan index 0 dan dimensi 2 dengan index 1: "+array[0][1]);
        System.out.println("Dimensi 1 dengan index 1 dan dimensi 2 dengan index 0: "+array[1][0]);
        System.out.println("Dimensi 1 dengan index 1 dan dimensi 2 dengan index 1: "+array[1][1]);
        System.out.println("Dimensi 1 dengan index 1 dan dimensi 2 dengan index 2: "+array[1][2]);
    }

    private static void tryLoopingArray() {
        int array[] = new int[100];
        for (int a=0; a<array.length;a++){
            array[a] = a+1;
            System.out.println(array[a]);
        }
    }

    private static void tryArray() {
        int newArray[] = new int[]{1,2,3,4,5,6};
        for (int aNewArray : newArray) {
            System.out.println(aNewArray);
        }
    }
}
