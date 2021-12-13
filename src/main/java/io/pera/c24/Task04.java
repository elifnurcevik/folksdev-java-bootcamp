package io.pera.c24;

public class Task04 {
    public static void main(String[] args) {
        BankaHesap emre = new BankaHesap(123, 500);
        BankaHesap hasan = new BankaHesap(163, 1500);
        BankaHesap ayse = new BankaHesap(743, 6500);
        BankaHesap burhan = new BankaHesap(189, 12500);
        ayse.paraCek(1000);
        burhan.paraCek(2500);
        hasan.paraCek(450);
        ayse.kiyasla(emre);
        emre.kiyasla(burhan);

        BankaHesap.bankaOzetiGoster();
    }
}

class BankaHesap {

    private int hesapNo;
    private int hesapBakiye;
    private static int tumBankaBakiyesi = 0;
    private static int tumHesapSayisi = 0;
    private static int operasyonSayisi = 0;

    public BankaHesap(int hesapNo, int hesapBakiye) {
        this.hesapNo = hesapNo;
        this.hesapBakiye = hesapBakiye;
        tumBankaBakiyesi += hesapBakiye;
        tumHesapSayisi++;
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getHesapBakiye() {
        return hesapBakiye;
    }

    public void setHesapBakiye(int hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }

    public void kiyasla(BankaHesap kiyaslanacakHesap) {
        if (this.getHesapBakiye() < kiyaslanacakHesap.getHesapBakiye()) {
            System.out.println(this.getHesapNo() + " numaralı kişinin parası " + kiyaslanacakHesap.getHesapNo() + " numaralı kişinin parasından azdır");
        } else if (this.getHesapBakiye() > kiyaslanacakHesap.getHesapBakiye()) {
            System.out.println(this.getHesapNo() + " numaralı kişinin parası " + kiyaslanacakHesap.getHesapNo() + " numaralı kişinin parasından fazladır");
        } else {
            System.out.println(this.getHesapNo() + " numaralı kişinin parası " + kiyaslanacakHesap.getHesapNo() + " numaralı kişinin parasına eşittir");
        }
    }

    public void paraYatir(int paraMiktarı) {
        this.hesapBakiye += paraMiktarı;
        operasyonSayisi++;
    }

    public void paraCek(int paraMiktarı) {
        if (this.hesapBakiye >= paraMiktarı) {
            this.hesapBakiye -= paraMiktarı;
            operasyonSayisi++;
            tumBankaBakiyesi -= paraMiktarı;
        } else {
            System.out.println("Hesabınızda yeterli bakiye yoktur");
        }
    }

    public static void bankaOzetiGoster() {
        System.out.println("Bankadaki hesap sayısı: " + tumHesapSayisi);
        System.out.println("Bankadaki toplam para: " + tumBankaBakiyesi);
        System.out.println("Bankada yapılan tüm operasyon sayısı: " + operasyonSayisi);


    }
}