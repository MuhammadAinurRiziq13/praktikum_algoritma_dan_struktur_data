/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Queue antrian = new Queue();
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("No Antrian: ");
                    sc.nextLine(); //untuk next line
                    String no = sc.nextLine();
                    System.out.print("Nama penerima: ");
                    String nama = sc.nextLine();
                    Pengantri Q = new Pengantri(no,nama);
                    antrian.enqueue(Q);
                    break;
                case 2:
                    Pengantri Q1 = antrian.dequeue();
                    if (Q1 != null ) { 
                        System.out.println(Q1.nama+" telah selesai divaksinasi");
                        antrian.print();
                    }
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    System.out.println("Masukkan nama Pengantri: ");
                    String Pengantri = sc.nextLine();
                    antrian.cariPengantri(Pengantri);
                    break;
                case 5:
                    antrian.sorting();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }while(pilih > 0 && pilih < 7);
    }
    public static void menu(){
        System.out.println("-----------------------------");
        System.out.println("PENGANTRI VAKSIN EXTRAAGANZA");
        System.out.println("-----------------------------");
        System.out.println("1. Tambah data penerima vaksin");
        System.out.println("2. Hapus data pengantri vaksin");
        System.out.println("3. Daftar penerima vaksin");
        System.out.println("4. Searching berdasarkan nama");
        System.out.println("5. Sorting");
        System.out.println("6. Keluar");
        System.out.println("----------------------------");
    }
}
