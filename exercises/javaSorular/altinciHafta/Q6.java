package exercises.javaSorular.altinciHafta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6 {

    public static void main(String[] args) {

        /*
            Array'i ARRAYLIST'e çeviren Java Kodunu yazınız.

            Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

            Beklenen Çıktı:
            [Python, JAVA, PHP, Perl, C#, C++]
         */

        String[] arr = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }


        /*
        2.Yöntem

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);
        */

    }

}
