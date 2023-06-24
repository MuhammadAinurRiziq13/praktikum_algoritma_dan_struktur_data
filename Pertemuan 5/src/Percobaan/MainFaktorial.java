/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Percobaan;

import java.util.Scanner;
public class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.print("masukkan jumlah elemen  yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for(int i =0;i< elemen;i++){
            fk[i] = new Faktorial();
            System.out.print("masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }        
        System.out.println("============================================================");
        System.out.println("Hasil faktorial dengan brute force");
        long start1=0;
        long end1= 0;
        for(int i = 0;i< elemen;i++){
            start1 =System.nanoTime();
            System.out.println("faktorial dari nilai"+fk[i].nilai+" adalah : "
                    +fk[i].faktorialBF(fk[i].nilai));
            end1 = System.nanoTime();
        }
        //System.out.println("lama waktu: "+(end1-start1));
        System.out.println("============================================================");
        System.out.println("hasil faktorial dengan divide and conquer");
        long start2=0;
        long end2= 0;
        for(int i = 0;i< elemen;i++){start2 =System.nanoTime();
            System.out.println("faktorial dari nilai"+fk[i].nilai+" adalah : "
                    +fk[i].faktorialDC(fk[i].nilai));
            end2 =System.nanoTime();
        }
        //System.out.println("lama waktu: "+(end2-start2));
        System.out.println("============================================================");
    }  
}
