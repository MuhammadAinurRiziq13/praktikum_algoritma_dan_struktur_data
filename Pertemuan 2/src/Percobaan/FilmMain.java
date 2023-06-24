/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
public class FilmMain {
    public static void main(String[] args) {
        Film film1 = new Film();
        
        film1.judul = "quantumania mancing";
        film1.genre = "action comedy";
        film1.rate = "remaja";
        film1.jumlahTiket = 3000;
        film1.hargaTiket = 40000;
        
        film1.tambahTiket(1);
        film1.kurangTiket(3);
        film1.tampilFilm();
        
        int income = film1.totalRevenue(4);
        
        System.out.println("Total jual 4 tiket = "+income);
        System.out.println("=====================================");
        Film film2 = new Film ("maniquantum","horor","dewasa",2000,40000);
        film2.tampilFilm();
        System.out.println("=====================================");
        Barang film3 = new Barang("pop corn", "air mnineral",30000,5000);
        film3.tampilBarang();
  
        
    }
}
