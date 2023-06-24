/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customer = "iya";
        int pemasukan = 0;
        int p = 0;
        String nama;
        do {
            System.out.println("================KASIR SMILE LAUNDRY==================");
            System.out.print("Nama costumer: ");
            if (p < 1) {
                nama = sc.nextLine();
            } else {
                nama = sc.nextLine();
                nama = sc.nextLine();
            }
            System.out.print("berat pakainnya [kg]: ");
            double berat = sc.nextDouble();
            double harga;
            if (berat <= 10) {
                harga = (berat * 4500);
            } else {
                harga = (berat * 4500) - ((berat * 4500) * 5 / 100);
            }
            pemasukan += harga;
            System.out.println("Harga: " + harga);
            System.out.println("=========================================================");
            System.out.println("Pemasukan toko: " + pemasukan);
            System.out.println("=========================================================");
            System.out.print("ingin memasukkan customer lain [iya/tidak]: ");
            customer = sc.next();
            System.out.println();
            p++;
        } while (customer.equalsIgnoreCase("iya"));

    }
}

