package io.pera.c24;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Çemberin yarıçapını giriniz: ");
        int yaricap = scanner.nextInt();

        CemberDaire cember1 = new CemberDaire(yaricap);
        System.out.println("Çemberin çevresi: " + cember1.cevreBul());
        System.out.println("Çemberin alanı: " + cember1.alanBul());

    }
}

class CemberDaire {

    private int yariCap;
    public final static double PI = 3.14;

    public CemberDaire(int r) {
        this.yariCap = r;
    }

    public int cevreBul() {
        return (int) (2 * PI * yariCap);
    }

    public double alanBul() {
        return PI * Math.pow(yariCap, 2);
    }
}