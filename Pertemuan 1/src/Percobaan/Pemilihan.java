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

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("program menghitung nilai akhir");
        System.out.println("===================================");
        System.out.print("masukkan nilai tugas: ");
        int tugas = sc.nextInt();
        System.out.print("masukkan nilai uts: ");
        int uts = sc.nextInt();
        System.out.print("masukkan nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println();
        double nilaiAkhir = (tugas * 20 / 100) + (uts * 35 / 100) + (uas * 45 / 100);
        String nilaiHuruf = "";
        String status = "";
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            status = "ANDA LULUS";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            status = "ANDA LULUS";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            status = "ANDA LULUS";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            status = "ANDA LULUS";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            status = "ANDA LULUS";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            status = "ANDA TIDAK LULUS";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            status = "ANDA TIDAK LULUS";
        }
        System.out.println("===============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("===============================");
        System.out.println(status);
    }
}

