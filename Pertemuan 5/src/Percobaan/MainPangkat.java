/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.print("masukkan jumlah elemen yang ingin di hitung: ");
        int elemen = sc.nextInt();
        int bil []= new int [elemen];
        int pangkat [] = new int[elemen];
        Pangkat [] png = new Pangkat[elemen];
        System.out.print("Algoritma yang digunakan [1.BF/2.DC] : ");
        int algo = sc.nextInt();
 
        for(int i = 0;i<elemen;i++){
            png[i]= new Pangkat(bil[i], pangkat[i]);
            System.out.print("masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            bil[i] = sc.nextInt();
            System.out.print("masukkan nilai pangkat ke-"+(i+1)+" : ");
            pangkat[i] = sc.nextInt();        
        }
        if(algo==1){
            System.out.println("============================================================");
            System.out.println("Hasil pangkat dengan brute force");
            for(int i = 0;i< elemen;i++){
                System.out.println("nilai "+bil[i]+" pangkat "+pangkat[i]+" adalah : "
                        +png[i].PangkatBF(bil[i], pangkat[i]));
            }
        }else{
            System.out.println("============================================================");
            System.out.println("hasil pangkat dengan divide and conquer");
            for(int i = 0;i< elemen;i++){
                System.out.println("nilai "+bil[i]+" pangkat "+pangkat[i]+" adalah : "
                        +png[i].PangkatDC(bil[i], pangkat[i]));
            }
        }
        System.out.println("============================================================");      
    }            
}
