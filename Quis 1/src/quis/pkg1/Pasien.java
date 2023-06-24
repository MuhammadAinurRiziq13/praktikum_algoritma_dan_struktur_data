/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quis.pkg1;

/**
 *
 * @author LENOVO
 */
public class Pasien {
    //atribut dari pasien
    String nama;
    int umur;
    int  [] hargaObat = new int[5];
    
    //hitung total obat
    double hitungTotalObat(){
        int total=0;
        for(int i = 0;i<5;i++){
            hargaObat[i]+= total;
        }
        return 0;
    }
}
