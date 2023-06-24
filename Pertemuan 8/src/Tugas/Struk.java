/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Struk{
    String nomorTransaksi, tanggalPembelian;
    int jumlahBarang;
    double totalHargaBayar;

    public Struk(String nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHargaBayar){
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHargaBayar = totalHargaBayar;
    }
    
    public void tampil(){
        System.out.println("Nomor trabsaksi: "+nomorTransaksi);
        System.out.println("Tanggal pembelian: "+tanggalPembelian);
        System.out.println("Jumlah barang: "+jumlahBarang);
        System.out.println("Total harga bayar: "+totalHargaBayar);
    }

//    public String ubahString(){
//        return "Nomor transaksi: " + nomorTransaksi + "\nTanggal pembelian: " + tanggalPembelian + "\nJumlah barang: " + jumlahBarang + "\nTotal harga bayar: " + totalHargaBayar;
//    }
  
}
