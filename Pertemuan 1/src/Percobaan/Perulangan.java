/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong();
        long n = nim % 100;
        if (n < 10) {
            n += 10;
        }
        System.out.println("n : " + n);
        String[] hari = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" };
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                System.out.println();
            }
            System.out.print(hari[i % 7] + " ");

        }

    }
}

