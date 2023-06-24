/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class CariRekening {
    Rekening rkng[];
    int idx;

    // constructor
    CariRekening(int banyak) {
        rkng = new Rekening[banyak];
        idx = 0;
    }

    // method untuk menambahkah rekening
    public void tambah(Rekening r) {
        if (idx < rkng.length) {
            rkng[idx] = r;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    // method untuk menampilkan semua data
    public void tampil() {
        for (Rekening r : rkng) {
            r.print();
            System.out.println("--------------------------------");
        }
    }

    // method untuk Menampilkan data Rekening yang memiliki saldo < 50000
    public void tampilsedikit() {
        for (int i = 0; i < rkng.length; i++) {
            if (rkng[i].saldo < 50000) {
                System.out.println("--------------------------------");
                rkng[i].print();
            }
        }
    }

    // method untuk mengurutkan data Rekening berdasarkan saldo dalam mode menurun
    public void bubblesort() {
        for (int i = 0; i < rkng.length; i++) {
            for (int j = 0; j < rkng.length - 1; j++) {
                if (rkng[j].saldo < rkng[j + 1].saldo) {
                    Rekening temp = rkng[j];
                    rkng[j] = rkng[j + 1];
                    rkng[j + 1] = temp;
                }
            }
        }
    }

    // method untuk Cari data Rekening berdasarkan kata kunci nama
    public int cariData(String cari) {
        int posisi = -1;
        for (int i = 0; i < rkng.length; i++) {
            if (rkng[i].nama.equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    // method untuk menampilkan hasil dari data yang sudah dicari
    public void tampilData(String a, int posisi) {
        if (posisi != -1) {
            System.out.println("\nno rekening: " + rkng[posisi].noRekening);
            System.out.println("nama: " + a);
            System.out.println("telephon: " + rkng[posisi].telefon);
            System.out.println("email: " + rkng[posisi].email);
            System.out.println("saldo: " + rkng[posisi].saldo);
        } else {
            System.out.println("data tidak ditemukan");
        }
    }

    // method untuk Tarik dari Rekening untuk sejumlah uang tertentu
    public int tarik(int posisi, int jml) {
        int hasil = rkng[posisi].saldo - jml;
        return hasil;
    }

    // method untuk setor dari Rekening untuk sejumlah uang tertentu
    public int setor(int posisi, int jml) {
        int hasil = rkng[posisi].saldo + jml;
        return hasil;
    }

}

