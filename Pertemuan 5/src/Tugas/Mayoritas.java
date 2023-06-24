/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Mayoritas {
    int suara;
    String nama [];
    
    Mayoritas(int n){
        suara = n;
        nama = new String[n];
    }
    
    public static String cariMayoritas(String[] nama, int l, int r) {
        if (l == r) {
            return nama[l];
        }
        int mid = (l + r) / 2;
        String mayoritasKiri = cariMayoritas(nama, l, mid);
        String mayoritasKanan = cariMayoritas(nama, mid + 1, r);

        // Mencari mayoritas pemenang pada subarray kiri
        int leftCount = 0;
        for (int i = l; i <= r; i++) {
            if (nama[i].equals(mayoritasKiri)) {
                leftCount++;
            }
        }
        if (leftCount > (r - l + 1) / 2) {
            return mayoritasKiri;
        }

        // Mencari mayoritas pemenang pada subarray kanan
        int rightCount = 0;
        for (int i = l; i <= r; i++) {
            if (nama[i].equals(mayoritasKanan)) {
                rightCount++;
            }
        }
        if (rightCount > (r - l + 1) / 2) {
            return mayoritasKanan;
        }

        // Jika tidak ada mayoritas, kembalikan "Tidak ada Mayoritas"
        return "Tidak ada Mayoritas";
    }
}
