package day.pkg5;

import java.util.Scanner;
public class Day5coding {
    public static void main(String[] args) {
        System.out.println("BILANGAN");
        Scanner dn = new Scanner(System.in);
        System.out.print("masukkan angka= ");
        int angka = dn.nextInt();
        if (angka % 2 == 0 && angka < 0) {
            System.out.println(angka + " merupakan bilangan genap negatif");

        } else if (angka % 2 == 0 && angka > 0) {
            System.out.println(angka + " merupakan bilangan genap positif");

        } else if (angka % 2 != 1 && angka < 0) {
            System.out.println(angka + " merupakan bilangan ganjil negatif");

        } else if (angka % 2 == 1 && angka > 0) {
            System.out.println(angka + " merupakan bilangan ganjil positif");

        } else {
            System.out.println(angka + " merupakan bilangan nol");
        }
    }
}
