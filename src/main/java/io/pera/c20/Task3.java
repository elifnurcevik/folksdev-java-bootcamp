package io.pera.c20;

import java.util.Scanner;

import static io.pera.c20.Task2.randomGenerate;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kolon sayısı girin: ");

        int kolonSayisi = scanner.nextInt();

        int[][] kolon = new int[kolonSayisi][6];

        for (int i = 0; i<kolonSayisi; i++){
            for (int j = 0; j<6; j++){
                int sayi = randomGenerate(0,49);
                if (sayi != kolon[i][j]){
                    kolon[i][j] = sayi;
                }
            }
        }

        System.out.println("Oynana kolonlar: ");

        for (int i = 0; i<kolonSayisi; i++){
            for (int j = 0; j<6; j++){
                System.out.print(kolon[i][j]);
            }}


    }
}
