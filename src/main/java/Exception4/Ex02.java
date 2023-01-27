package Exception4;

import java.util.Scanner;

public class Ex02 {

       /*
       Kullanicidan yasini isteyin
       kullanici yas olarak negatif bir sayi,
       0 veya
       120'den buyuk bir sayi girerse illegalArgumentException olusacak sekilde
       bir program yaziniz
       */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi giriniz");// THROW -- THROWS
        int age = scan.nextInt();

        try {
            if (age <= 0 || age > 120) {
                throw new IllegalArgumentException("yas 0dan kucuk ve 120 den buyuk olamaz");
            } else {
                System.out.println(age);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}



