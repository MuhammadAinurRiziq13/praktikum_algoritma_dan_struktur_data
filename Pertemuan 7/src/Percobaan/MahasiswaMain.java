/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();

        PencarianMhs data = new PencarianMhs(jumMhs);

        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil");

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("--------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();

            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa");
        data.tampil();
        System.out.println("___________________________________________________");
        System.out.println("___________________________________________________");
        System.out.println("Pencarian data : ");
        
//        System.out.println("Masukkan nim  mahasiswa yang dicari: ");
//        System.out.print("NIM: ");
//        int cari = s.nextInt();
//        System.out.println("menggunakan sequential search");
//        int posisi = data.FindSeqSearch(cari);
//        data.Tampilpoisisi(cari, posisi);
//        data.TampilData(cari, posisi);
//        System.out.println("====================================================");
//        System.out.println("menggunakan binary search ");
//        data.mergeSort();
//        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
//        data.Tampilpoisisi(cari, posisi);
//        data.TampilData(cari, posisi);
        
        //searching berdasarkan nama
        System.out.print("Masukkan nama  mahasiswa yang dicari: ");
        String CariNama = s.next();
        int counter = data.FindSeqSearch(CariNama);
        data.TampilData(CariNama, counter);
        if(counter == 0){
            System.out.println("Data tidak ditemukan");
        }else{
            System.out.println("ditemukan "+(counter)+" data");
        }
        
    }
}
