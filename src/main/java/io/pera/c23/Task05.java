package io.pera.c23;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplam öğrenci sayısını giriniz: ");
        int ogrenciSayisi = scanner.nextInt();

        System.out.print("Toplam soru sayısını giriniz: ");
        int soruSayisi = scanner.nextInt();

        char[][] tumCevaplar = new char[ogrenciSayisi][soruSayisi];
        char[] cevapAnahtari = new char[soruSayisi];


        cevapAnahtariOlustur(cevapAnahtari);
        ogrenciCevaplariniYerlestir(tumCevaplar);
        ogrenciCevaplariniGoruntule(tumCevaplar);
        cevapAnahtariGoruntule(cevapAnahtari);
        ogrencileriDegerlendir(cevapAnahtari, tumCevaplar);

    }

    private static void cevapAnahtariGoruntule(char[] cevapAnahtari) {
        for (char secenek : cevapAnahtari) {
            System.out.print(secenek + ", ");
        }
        System.out.println();
    }

    private static void ogrenciCevaplariniGoruntule(char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {
            for (int sütun = 0; sütun < tumCevaplar[satir].length; sütun++) {
                System.out.print(tumCevaplar[satir][sütun] + ", ");
            }
            System.out.println();
        }
    }

    private static void ogrencileriDegerlendir(char[] cevapAnahtari, char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {
            int dogruCevapSayisi = 0;
            for (int sütun = 0; sütun < tumCevaplar[satir].length; sütun++) {
                if (tumCevaplar[satir][sütun] == cevapAnahtari[sütun]) {
                    dogruCevapSayisi++;
                }
            }
            System.out.println(satir + " indexindeki öğrenci sayısı: " + dogruCevapSayisi);
        }
    }

    private static void cevapAnahtariOlustur(char[] cevapAnahtari) {
        for (int i = 0; i < cevapAnahtari.length; i++) {
            cevapAnahtari[i] = cevapOlustur();
        }
    }

    private static void ogrenciCevaplariniYerlestir(char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {
            for (int sütun = 0; sütun < tumCevaplar[satir].length; sütun++) {
                tumCevaplar[satir][sütun] = cevapOlustur();
            }
        }
    }

    public static char cevapOlustur() {
        int rastgeleSayi = 65 + (int) (Math.random() * 5);
        char uretilenSecenek = (char) rastgeleSayi;
        return uretilenSecenek;
    }
}
