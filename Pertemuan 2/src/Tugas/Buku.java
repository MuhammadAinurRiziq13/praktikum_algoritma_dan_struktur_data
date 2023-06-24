/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Buku {
    String nama,pengarang,penerbit;
    int hargaSatuan,jumlah;
    
    Buku (){
         nama = "atomic habits";
         pengarang = "james clear";
         penerbit ="gramedia";
         hargaSatuan = 40000;

    }
      
    Buku (String nm,String png,String pnr,int hs,int jml){
        nama= nm;
        pengarang = png;
        penerbit = pnr;
        hargaSatuan = hs;
        jumlah = jml;
        
        System.out.println("judul buku : "+nama);
        System.out.println("pengarang : "+pengarang);
        System.out.println("penerbit : "+penerbit);
        System.out.println("jumlah buku: "+jumlah);
        System.out.println("harga satuan: "+hargaSatuan);
        System.out.println("========================================");
        System.out.println("harga total : "+hitungHargaTotal());
        System.out.println("diskon : "+hitungDiskon());
        System.out.println("========================================");
        System.out.println("harga bayar : "+hitungHargaBayar());
    }
    
    int hitungHargaTotal(){
        return hargaSatuan *jumlah;
    }
    
    int hitungDiskon(){
        if(hitungHargaTotal()>100000){
            return (int) (hitungHargaTotal()*0.1);
        }else if(hitungHargaTotal()>= 50000 && hitungHargaTotal() <= 100000){
            return (int) (hitungHargaTotal()*0.05);
        }
        return 0;
    }
    
    int hitungHargaBayar(){
        return hitungHargaTotal()-hitungDiskon();
    }
}

    
