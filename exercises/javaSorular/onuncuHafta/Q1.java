package exercises.javaSorular.onuncuHafta;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Q1 {

    public static void main(String[] args) {

        /*
            HashSet ile list oluşturalım ve  TreeSet ile sıralayalım
            ve listeyi yazdıralım.

            HashSet List: sari,mavi,kirmizi,yesil,mor

            Beklenen Çıktı:
            TreeSet elements:
            kirmizi
            mavi
            mor
            sari
            yesil
     */

        HashSet<String> renkler = new HashSet<>();

        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("yesil");
        renkler.add("mor");

        TreeSet<String> renklerTreeSet = new TreeSet<>(renkler);

        System.out.println("TreeSet elements:");

        for (String each : renklerTreeSet){
            System.out.println(each);
        }

    }

}
