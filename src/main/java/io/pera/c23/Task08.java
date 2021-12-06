package io.pera.c23;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                if (i == j || j == (satirSayisi - i -1)){
                    System.out.print("x");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
