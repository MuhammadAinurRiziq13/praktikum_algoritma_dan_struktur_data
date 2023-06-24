/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Hotel {
    String nama,kota;
    int harga;
    byte bintang;

    public Hotel(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }
    
    void print (){
        System.out.println("Nama: "+nama);
        System.out.println("Kota: "+kota);
        System.out.println("Harga: "+harga);
        System.out.println("Bintang: "+bintang);
    } 
}
