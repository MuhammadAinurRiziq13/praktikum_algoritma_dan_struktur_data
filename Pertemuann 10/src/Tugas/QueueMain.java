/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int n = sc.nextInt();
        Queue q = new Queue(n);

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama pembeli: ");
                    sc.nextLine(); // untuk nextline
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nomor HP pembeli: ");
                    int noHP = sc.nextInt();
                    Pembeli pbl = new Pembeli(nama, noHP);
                    q.enqueue(pbl);
                    break;
                case 2:
                    Pembeli pbl2 = q.dequeue();
                    if (!"".equals(pbl2.nama) && pbl2.noHP != 0 ) { // pbl2 != null 
                        System.out.println("Pembeli " + pbl2.nama + pbl2.noHP+" telah keluar dari antrian");
                    }
                    break;
                case 3:
                    q.peek();
                    break;
                case 4: 
                    q.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli yang dicari: ");
                    sc.nextLine(); // untuk nextline
                    String namaCari = sc.nextLine();
                    q.peekPosition(namaCari);
                    break;
                case 6:
                    q.daftarPembeli();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih != 0);
    }
    public static void menu(){
        System.out.println("\n===== ANTRIAN WARUNG =====");
            System.out.println("1. Tambah pembeli ke antrian");
            System.out.println("2. Keluarkan pembeli dari antrian");
            System.out.println("3. Tampilkan pembeli paling depan di antrian");
            System.out.println("4. Tampilkan pembeli paling belakang di antrian");
            System.out.println("5. Cari posisi pembeli di antrian berdasarkan nama");
            System.out.println("6. Tampilkan daftar seluruh pembeli di antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
    }
}
