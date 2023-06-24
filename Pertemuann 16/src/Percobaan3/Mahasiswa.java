/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan3;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    String nim,nama,notelp;

    public Mahasiswa() {
    }
    
    public Mahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    
    @Override
    public String toString (){
        return "Mahasiswa{"+"nim="+nim+", nama="+nama+", notelp="+notelp+"}";
    }
 
}
