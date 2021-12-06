package io.pera.c23;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int girilenSayi = scanner.nextInt();
        String binarySayi = "";
        if (girilenSayi == 0){
            binarySayi = "0";
        }
        while(girilenSayi > 0){
            int mod = girilenSayi % 2;
            binarySayi = mod + binarySayi;
            girilenSayi = girilenSayi / 2;
        }
        System.out.println("Sayının binary hali: " + binarySayi);
    }
}
