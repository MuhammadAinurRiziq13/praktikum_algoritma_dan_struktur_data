/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PROGRAM HITUNG BANGUN RUANG ");
        System.out.println("1.kerucut");
        System.out.println("2.limas segi empat");
        System.out.println("3.bola");
        System.out.print("masukkan bangun ruang yang dipilih: ");
        int pilih = sc.nextInt();
        
        System.out.print("masukkan panjang array: ");
        int n = sc.nextInt();
        
        Kerucut [] kerucut = new Kerucut[n];
        LimasSegiEmpat [] limasSegiEmpat = new LimasSegiEmpat[n];
        Bola [] bola = new Bola[n];
        System.out.println("");
        
        for(int i = 0;i < n;i++){
            if(pilih == 1){
                kerucut[i]= new Kerucut();
                System.out.println("masukkan nilai kerucut- "+(i+1));
                System.out.print("masukkan jari: ");
                kerucut[i].jariJari = sc.nextDouble();
                System.out.print("masukkan tinggi: ");
                kerucut[i].sisiMiring = sc.nextDouble();
            }else if(pilih == 2){
                limasSegiEmpat[i]= new LimasSegiEmpat();
                System.out.println("masukkan nilai limas segi empat- "+(i+1));
                System.out.print("masukkan sisi alas: ");
                limasSegiEmpat[i].sisiAlas = sc.nextDouble();
                System.out.print("masukkan tinggi: ");
                limasSegiEmpat[i].tinggi= sc.nextDouble();
            }else if(pilih == 3){
                bola[i]= new Bola();
                System.out.println("masukkan nilai bola- "+(i+1));
                System.out.print("masukkan jari-jari: ");
                bola[i].jariJari = sc.nextDouble();
            }              
        }   
        System.out.println("");
        
        for(int i = 0; i<n;i++){
            switch (pilih) {
                case 1:
                    System.out.printf("Kerucut ke-%d \n",(i+1));
                    System.out.printf("Volume : %.2f \n",kerucut[i].hitungVolume());
                    System.out.printf("luas permukaan: %.2f \n",kerucut[i].hitungLuasPermukaan());
                    System.out.println("");
                    break;
                case 2:
                    System.out.printf("limas segi empat ke-%d \n",(i+1));
                    System.out.printf("Volume: %.2f \n",limasSegiEmpat[i].hitungVolume());
                    System.out.printf("Luas permukaan: %.2f \n",limasSegiEmpat[i].hitungLuasPermukaan());
                    System.out.println("");
                    break;
                case 3:
                    System.out.printf("Bola ke-%d \n",(i+1));
                    System.out.printf("volume: %.2f \n",bola[i].hitungVolume());  
                    System.out.printf("Luas permukaan: %.2f \n",bola[i].hitungLuasPermukaan());
                    System.out.println("");
                    break;
                default:
                    break;
            }
       
        }       
    }
    
}
