package day06_nestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_C03_IfElseIf_Indirim {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                                az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                                az alirsa %10 indirim yapin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int urunAdedi = scan.nextInt();

        System.out.println("Lutfen urunun indirimsiz fiyatini giriniz");
        double urunFiyati = scan.nextDouble();

        double indirimsizToplamFiyat = urunAdedi * urunFiyati;

        System.out.println("Musteri kartiniz var mi E: evet H: hayir");
        char kartVarMi = scan.next().toUpperCase().charAt(0);

        if (kartVarMi == 'E' && urunAdedi > 10) {
            System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat * 80 / 100);
        } else if (kartVarMi == 'E' && urunAdedi > 0) {
            System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
        } else if (kartVarMi == 'H' && urunAdedi > 10) {
            System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85 / 100);
        } else if (kartVarMi == 'H' && urunAdedi > 0) {
            System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat * 90 / 100);
        } else {
            System.out.println("Girilen degerler hatali");
        }

    }

}
