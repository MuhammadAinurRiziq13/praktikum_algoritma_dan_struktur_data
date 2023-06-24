/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s, v, t;
        String rumus = "";
        System.out.println("====================PROGRAM MENGHITUNG=================");
        do {
            System.out.println("Rumus menghitung : ");
            System.out.println("1.Kecepatan");
            System.out.println("2.Jarak");
            System.out.println("3.Waktu");
            System.out.print("Rumus dipilih [1/2/3]: ");
            int menu = sc.nextInt();
            System.out.println();
            if (menu == 1) {
                System.out.println("menghitung kecepatan: ");
                System.out.print("masukkan jarak: ");
                s = sc.nextInt();
                System.out.print("masukkan waktu: ");
                t = sc.nextInt();
                System.out.println("kecepatnnya: " + kecepatan(s, t) + " m/s");
            } else if (menu == 2) {
                System.out.println("menghitung jarak: ");
                System.out.print("masukkan kecepatan: ");
                v = sc.nextInt();
                System.out.print("masukkan waktu: ");
                t = sc.nextInt();
                System.out.println("jaraknya: " + jarak(v, t) + " meter");
            } else if (menu == 3) {
                System.out.println("menghitung waktu: ");
                System.out.print("masukkan jarak: ");
                s = sc.nextInt();
                System.out.print("masukkan kecepatan: ");
                v = sc.nextInt();
                System.out.println("waktunya: " + waktu(s, v) + " detik");
            } else {
                System.out.println("anda salah memasukkan nomor");
            }
            System.out.println();
            System.out.print("ingin memasukkan rumus lain [iya/tidak]: ");
            rumus = sc.next();
            System.out.println();
        } while (rumus.equalsIgnoreCase("iya"));

    }

    static double kecepatan(double s, double t) {
        double total = s / t;
        return total;
    }

    static double jarak(double v, double t) {
        double total = v * t;
        return total;
    }

    static double waktu(double s, double v) {
        double total = s / v;
        return total;
    }
}

