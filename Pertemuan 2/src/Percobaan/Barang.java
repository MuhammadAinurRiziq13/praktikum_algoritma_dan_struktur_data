/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
public class Barang {
    String makanan,minuman;
    int hargaMakanan,hargaMinuman,total;
    
    Barang(String mkn,String mnm,int hmk,int hmn ){
        makanan = mkn;
        minuman = mnm;
        hargaMakanan = hmk;
        hargaMinuman = hmn;
    }
    void tampilBarang(){
        System.out.println("makanan: "+makanan);
        System.out.println("minuman: "+minuman);
        System.out.println("harga makanan: "+hargaMakanan);
        System.out.println("harga minuman: "+hargaMinuman);
        System.out.println("total: "+hitungTotal());
        
    }
    int hitungTotal (){
        return hargaMakanan+hargaMinuman;
    }
}
