package day31_exceptions;

import java.util.Scanner;

public class C10_KontrolluExceptionFirlatma {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini alin
        // eger ikisi de 4 harften uzunsa "super"
        // 4 harften kisa olan varsa "kotu" yazdirin

        Scanner scanner = new Scanner(System.in);

        String isim = null;
        String soyIsim = null;

        try {

            System.out.println("Lutfen isminizi giriniz...");
            isim = scanner.nextLine();

            if (isim.length() < 4) {
                throw new RuntimeException();
            }

            System.out.println("Lutfen soyisminizi giriniz...");
            soyIsim = scanner.nextLine();

            if (soyIsim.length() < 4) {
                throw new RuntimeException();
            }

        } catch (Exception e) {
            System.out.println("");
        }

        if (isim.length() > 4 && soyIsim.length() > 4) {
            System.out.println("super");
        } else {
            System.out.println("kotu");
        }

    }

}