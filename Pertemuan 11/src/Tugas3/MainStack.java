/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author LENOVO
 */
public class MainStack {
    public static void main(String[] args) {
        Stack matkul = new Stack();

        // Menambahkan data ke stack
        matkul.push("bahasa");
        matkul.push("android");
        matkul.push("komputer");
        matkul.push("basis data");
        matkul.push("matematika");
        matkul.push("algoritma");
        matkul.push("statistika");
        matkul.push("multimedia");
        
        //menampilkan semua data dalam stack
        System.out.println("Semua isi data nya: ");
        matkul.print();
        System.out.println("------------------------------");
        
        // Menampilkan data pada posisi top
        System.out.println("Posisi top pada indeks : " + matkul.peek());

        // Mengeluarkan semua data dari stack
        matkul.pop(); 
    }
}
    
