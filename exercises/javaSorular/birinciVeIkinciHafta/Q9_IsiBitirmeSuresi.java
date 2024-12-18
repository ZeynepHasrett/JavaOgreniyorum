package exercises.javaSorular.birinciVeIkinciHafta;

import java.util.Scanner;

public class Q9_IsiBitirmeSuresi {

    public static void main(String[] args) {

        /*
                Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
                hesaplayan kodu yazınız.

                Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
                Buna göre 2 işçi aynı işi kaç günde yapar?

                Örnek Ekran Çıktısı
                 Bir işçi işi kaç günde bitirmektedir? 10
                 Toplam kaç işçi çalışacak? 2
                 İşin bitme süresi 5 gündür.

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir işçi işi kaç günde bitirmektedir?");
        double sure = scan.nextDouble();

        System.out.println("Toplam kaç işçi çalışacak?");
        int toplamIsciSayisi = scan.nextInt();

        double isinBitmeSuresi = sure / toplamIsciSayisi;

        System.out.println("İşin bitme süresi " + isinBitmeSuresi + " gündür.");

    }

}
