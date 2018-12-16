package com.bayupamuji.dicodingjavafundamental.basic.oop.polymorphism;

class Hewan {
    public void makan(){
        System.out.println("hewan bisa makan");
    }
}

class Kucing extends Hewan{
    @Override
    public void makan() {
        System.out.println("Kucing juga bisa makan kok");
    }

    public void makan(String makanan){
        System.out.println("makanan kucing adalah "+makanan);
    }
}
