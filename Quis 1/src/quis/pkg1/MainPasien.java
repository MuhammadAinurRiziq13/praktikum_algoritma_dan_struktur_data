/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quis.pkg1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
// class main
public class MainPasien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pasien [] pasien = new Pasien[5];
        // input data pasien
        for(int i = 0;i<5;i++){
            pasien[i]= new Pasien();
            System.out.println("masukkan data pasien-"+(i+1));
            System.out.print("Nama: ");
            pasien[i].nama = sc.next();
            System.out.print("Umur: ");
            pasien[i].umur = sc.nextInt();
            //input data obat pasien
            for(int j = 0;j<5;j++){
            System.out.print("harga obat ke-"+(j+1)+": ");
                pasien[i].hargaObat[j]= sc.nextInt();
                pasien[i].hitungTotalObat();
            }
            //hitung ratapasien umur lebih dari 50
            if(pasien[i].umur > 50){
                double rata = pasien[i].hitungTotalObat()/5;
                
            }            
        }  
        //menentukan pasien dengan total obat terkecil
        double terkecil = pasien[0].hitungTotalObat();
        String obatTerkecil = pasien[0].nama;
        
            if(pasien[0].hitungTotalObat() > pasien[1].hitungTotalObat()|| pasien[0].hitungTotalObat() > pasien[2].hitungTotalObat()
                    || pasien[0].hitungTotalObat() > pasien[3].hitungTotalObat()|| pasien[0].hitungTotalObat() > pasien[4].hitungTotalObat()){
                terkecil = pasien[0].hitungTotalObat();
                obatTerkecil = pasien[0].nama;
            }else if(pasien[1].hitungTotalObat() > pasien[0].hitungTotalObat()|| pasien[1].hitungTotalObat() > pasien[2].hitungTotalObat()
                    || pasien[1].hitungTotalObat() > pasien[3].hitungTotalObat()|| pasien[1].hitungTotalObat() > pasien[4].hitungTotalObat() ){
                terkecil = pasien[1].hitungTotalObat();
                obatTerkecil = pasien[1].nama;
            }else if(pasien[2].hitungTotalObat() > pasien[0].hitungTotalObat()|| pasien[2].hitungTotalObat() > pasien[1].hitungTotalObat()
                    || pasien[2].hitungTotalObat() > pasien[3].hitungTotalObat()|| pasien[2].hitungTotalObat() > pasien[4].hitungTotalObat()){
                terkecil = pasien[2].hitungTotalObat();
                obatTerkecil = pasien[2].nama;
            }else if(pasien[3].hitungTotalObat() > pasien[0].hitungTotalObat()|| pasien[3].hitungTotalObat() > pasien[1].hitungTotalObat()
                    || pasien[3].hitungTotalObat() > pasien[2].hitungTotalObat()|| pasien[2].hitungTotalObat() > pasien[4].hitungTotalObat()){
                terkecil = pasien[3].hitungTotalObat();
                obatTerkecil = pasien[3].nama;
            }else{
                terkecil = pasien[4].hitungTotalObat();
                obatTerkecil = pasien[4].nama;
            }
            //menampilkan pasien dengan total obat terkecil
            System.out.println("data pasien dengan total obat terkecil: "+obatTerkecil);
 
    }
    
}
