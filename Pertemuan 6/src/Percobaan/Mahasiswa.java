/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    String nama;
    int thnMasuk,umur;
    double ipk;
    
    Mahasiswa(String n,int t,int u,double i){
        nama= n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }
    
    void tampil(){
        System.out.println("Nama= "+nama);
        System.out.println("Tahun Masuk = "+thnMasuk);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
    
}
