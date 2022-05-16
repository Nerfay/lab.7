package com.company;

public class Main {

    public static void main(String[] args) {
        Drob drob1 = new Drob(4, 20);
        Drob drob2 = new Drob(3,9);
        Drob drob3 = new Drob(1,2);
        Drob drob4 = new Drob(1,3);
        Drob drob5 = new Drob(1,5);

        Drob Z = ((drob1.plus(drob2)).division(drob3)).multiplication(drob4.minus(drob5));
        System.out.println(Z + "\n");
        System.out.println(Z.reduction());
    }
}
