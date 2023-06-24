/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Queue antrian = new Queue();
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama Pengunjung: ");
                    String nama = sc1.nextLine();
                    System.out.print("Masukkan judul film: ");
                    String judul = sc1.nextLine();
                    System.out.println("Masukkan Jumlah Tiket: ");
                    int jmlTiket = sc.nextInt();
                    Pengunjung P = new Pengunjung(nama, judul, jmlTiket);
                    antrian.enqueue(P);
                    break;
                case 2:
                    Pengunjung P1 = antrian.dequeue();
                    if(P1 != null){
                        System.out.println("Nama Pengunjung : " + P1.namaPengunjung + " telah dikeluarkan");
                    }
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    System.out.println("Masukkan nama pengunjung: ");
                    String namap = sc1.nextLine();
                    antrian.cariPengunjung(namap);
                default:
                    System.out.println("angka yang anda pilih salah");
            }
        } while (pilih > 0 && pilih < 4);
    }

    public static void menu() {
        System.out.println("-----------------------------");
        System.out.println("    ANTRIAN FILM LAYAR LEBAR");
        System.out.println("-----------------------------");
        System.out.println("1. Tambah data kedalam antrian");
        System.out.println("2. Keluarkan data dari antrian");
        System.out.println("3. Tampilkan semua antrian");
        System.out.println("4. Cari nama Pengunjung");
        System.out.println("5. Sorting");
        System.out.println("----------------------------");
    }
}
