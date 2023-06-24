/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        List<Nilai> daftarNilai = new ArrayList<>();
        Nilai nilai = new Nilai("", 0, null, null);

        Mahasiswa m1 = new Mahasiswa("20001", "thalhah", "021xxx");
        Mahasiswa m2 = new Mahasiswa("20002", "Zubair", "021xxx");
        Mahasiswa m3 = new Mahasiswa("20003", "Abdur", "021xxx");
        Mahasiswa m4 = new Mahasiswa("20004", "Sa'ad", "021xxx");
        Mahasiswa m5 = new Mahasiswa("20005", "Sa'id", "021xxx");
        Mahasiswa m6 = new Mahasiswa("20006", "Ubaidah", "021xxx");

        nilai.tambahMhs(m1, m2, m3, m4, m5, m6);

        MataKuliah mk1 = new MataKuliah("00001", "Internet of Things", 3);
        MataKuliah mk2 = new MataKuliah("00002", "Algoritma dan Struktur Data", 2);
        MataKuliah mk3 = new MataKuliah("00003", "Algoritma dan Pemrograman", 2);
        MataKuliah mk4 = new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah mk5 = new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3);

        nilai.tambahMatkul(mk1, mk2, mk3, mk4, mk5);

        String nimMhs , mkMhs;
        int menu = 0;
        do {
            System.out.println("-------------------------------------------------");
            System.out.println("Sistem Pengelolahan Data Nilai Mahasiswa Semester");
            System.out.println("-------------------------------------------------");
            System.out.println(" 1. Input Nilai");
            System.out.println(" 2. Tampil Nilai");
            System.out.println(" 3. Mencari Nilai Mahasiswa");
            System.out.println(" 4. Urut Data Nilai");
            System.out.println(" 5. Keluar");
            System.out.println("-------------------------------------------------");
            System.out.print("Pilih\t: ");
            menu = sc1.nextInt();
            System.out.println("");

            switch (menu) {
                case 1:
                    System.out.println("Masukkan data");
                    System.out.print("Kode\t: ");
                    String kd = sc.nextLine();
                    System.out.print("Nilai\t: ");
                    double nilMhs = sc2.nextDouble();
                    System.out.println("");
                    System.out.println("Daftar Mahasiswa              ");
                    System.out.println("------------------------------------------------");
                    System.out.println("NIM\t\tNama\t\tNo Telp");
                    nilai.tampilMhs();
                    System.out.println("-------------------------------------------------");
                    System.out.print("Pilih Mahasiswa by nim\t\t: ");
                    nimMhs = sc.nextLine();
                    Mahasiswa mahasiswa = nilai.cariMhs(nimMhs);
                    System.out.println("");
                    System.out.println("Daftar Mata Kuliah             ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                    nilai.tampilMatkul();
                    System.out.println("-------------------------------------------------");
                    System.out.print("Pilih Mata Kuliah by Kode\t:");
                    mkMhs = sc.nextLine();
                    MataKuliah mataKuliah = nilai.cariMatkul(mkMhs);
                    Nilai n1 = new Nilai(kd, nilMhs, mahasiswa, mataKuliah);
                    daftarNilai.add(n1);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Daftar Nilai Mahasiswa         ");
                    System.out.println("-------------------------------------------------");
                    System.out.println("NIM \t Nama \t\t Mata Kuliah \t\t SKS\tNilai");
                    for (Nilai n : daftarNilai) {
                        System.out.println(n.toString());
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Daftar Nilai Mahasiswa");
                    System.out.println("-------------------------------------------------");
                    System.out.println("NIM \t Nama \t\t Mata Kuliah \t\t SKS\tNilai");
                    for (Nilai n : daftarNilai) {
                        System.out.println(n.toString());
                    }
                    System.out.println("-------------------------------------------------");
                    System.out.print("Masukkan Data Mahasiswa [NIM]\t: ");
                    String input = sc.nextLine();
                    int sksTotal = 0;
                    boolean found = false;
                    System.out.println("NIM \t Nama \t\t Mata Kuliah \t\t SKS \t Nilai");
                    for (Nilai n : daftarNilai) {
                        if (n.mhs.nim.equals(input)) {
                            System.out.println(n.toString());
                            sksTotal += n.mk.sks;
                            found = true;
                        }
                    }
                    if (found) {
                        System.out.println("Total SKS " + sksTotal + " telah diambil");
                    } else {
                        System.out.println("Data mahasiswa dengan NIM " + input + " tidak ditemukan.");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Daftar Nilai Mahasiswa           ");
                    System.out.println("-----------------------------------------------");
                    System.out.println("NIM \t Nama \t\t Mata Kuliah \t\t SKS\tNilai");
                    daftarNilai.sort(Comparator.comparingDouble(n -> n.nilai));
                    for (Nilai n : daftarNilai) {
                        System.out.println(n.toString());
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (menu < 6 && menu > 0);
    }
}

