/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MainSum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jmlPerusahaan = sc.nextInt();
        Sum [] Perusahaan = new Sum[jmlPerusahaan];

        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("====================================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Masukkan jumlah bulan : ");
            int jmlBulan = sc.nextInt();
            Perusahaan[i]= new Sum(jmlPerusahaan, jmlBulan);
            for (int j = 0; j < jmlBulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " : ");
                Perusahaan[i].keuntungan[i][j] = sc.nextDouble();
            }
        }
        System.out.println("====================================");
        System.out.println("Algoritma Brute Force");     
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.printf("Total keuntungan perusahaan ke-%d selama %d bulan adalah = %.2f",
                    (i+1),Perusahaan[i].elemen,Perusahaan[i].totalBF(Perusahaan[i].keuntungan[i]));         
        }
        System.out.println("\n====================================");
        System.out.println("Algoritma Divide Conquer");
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("Total keuntungan semua perusahaan ke-"+(i+1)+" selama " + Perusahaan[i].elemen 
                    + " bulan adalah = " + Perusahaan[i].totalDC(Perusahaan[i].keuntungan[i],0, Perusahaan[i].elemen - 1));
        }
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("====================================");
//        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
//        System.out.print("Masukkan jumlah bulan : ");
//        int elm = sc.nextInt();
//
//        Sum sm = new Sum(elm);
//        System.out.println("====================================");
//        for(int i=0; i<sm.elemen; i++){
//            System.out.print("Masukkan untung bulan ke-"+(i+1)+" = ");
//            sm.keuntungan[i] = sc.nextDouble();
//        }
//        System.out.println("====================================");
//        System.out.println("Algoritma Brute Force");
//        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalBF(sm.keuntungan));
//        System.out.println("====================================");
//        System.out.println("Algoritma Divide Conquer");
//        System.out.println("Total keuntungan perusahaan selama "+sm.elemen+" bulan adalah = "+sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
