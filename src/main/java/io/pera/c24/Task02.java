package io.pera.c24;

public class Task02 {
    public static void main(String[] args) {
        Ogrenci tumOgrenciler[] = new Ogrenci[100];

        for (int i = 0; i < 100; i++) {
            int rastgeleID = (int) (Math.random() * 5000);
            int rastgeleNotDegeri = (int) (Math.random() * 100);

            Ogrenci yeni = new Ogrenci(rastgeleID, rastgeleNotDegeri);
            tumOgrenciler[i] = yeni;
        }
        ogrencileriNotlarinaGoreSirala(tumOgrenciler);

        for (int i = 0; i < 100; i++) {
            tumOgrenciler[i].ogrenciBilgileriniYazdır();
        }
    }

    private static void ogrencileriNotlarinaGoreSirala(Ogrenci[] tumOgrenciler) {

        for (int i = 0; i < tumOgrenciler.length; i++) {
            int oAnkiEnBuyukSayi = tumOgrenciler[i].getNotDegeri();
            int oAnkiEnBuyukElemaninIndeksi = i;

            for (int j = i + 1; j < tumOgrenciler.length; j++) {
                if (oAnkiEnBuyukSayi < tumOgrenciler[j].getNotDegeri()) {
                    oAnkiEnBuyukSayi = tumOgrenciler[j].getNotDegeri();
                    oAnkiEnBuyukElemaninIndeksi = j;
                }
            }
            if (oAnkiEnBuyukElemaninIndeksi != i) {
                tumOgrenciler[oAnkiEnBuyukElemaninIndeksi] = tumOgrenciler[i];
                tumOgrenciler[i].setNotDegeri(oAnkiEnBuyukSayi);
            }
        }
    }
}

class Ogrenci {

    private int id;
    private int notDegeri;

    public Ogrenci(int id, int notDegeri) {
        this.id = id;
        this.notDegeri = notDegeri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotDegeri() {
        return notDegeri;
    }

    public void setNotDegeri(int notDegeri) {
        this.notDegeri = notDegeri;
    }

    public void ogrenciBilgileriniYazdır() {
        System.out.println("ID: " + id + " Not: " + notDegeri);
    }
}