package io.pera.c24;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesaplamak istediğiniz işlem için sayıları girin: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();

        System.out.println("Toplamları: " + HesapMakinesi.topla(sayi1, sayi2, sayi3));
        System.out.println("Farkları: " + HesapMakinesi.cikar(sayi1, sayi2, sayi3));
        System.out.println("Çarpımları: " + HesapMakinesi.carp(sayi1, sayi2, sayi3));

        if (HesapMakinesi.bol(sayi1, sayi2, sayi3) != 0) {
            System.out.println("Bölümleri: " + HesapMakinesi.bol(sayi1, sayi2, sayi3));
        } else {
            System.out.println("Bölme işlemi başarısız");
        }
    }
}

class HesapMakinesi {

    public static int topla(int... parametreler) {
        int toplam = 0;
        for (int parametre : parametreler) {
            toplam += parametre;
        }
        return toplam;
    }

    public static int cikar(int... parametreler) {
        int fark = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            fark -= parametreler[i];
        }
        return fark;
    }

    public static int carp(int... parametreler) {
        int carpim = 1;
        for (int parametre : parametreler) {
            carpim *= parametre;
        }
        return carpim;
    }

    public static double bol(int... parametreler) {
        int bolum = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            if (parametreler[i] != 0) {
                bolum = bolum / parametreler[i];
            } else {
                System.out.println("Parametrelerden biri 0 olduğu için bölme yapılamadı");
                return -1;
            }
        }
        return bolum;
    }
}
