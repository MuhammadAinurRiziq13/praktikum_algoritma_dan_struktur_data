/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MainPersegiPanjang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan panjang array: ");
        int n = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[n];
        
    for(int i = 0;i<n;i++){
        ppArray[i] = new PersegiPanjang();
        System.out.println("Persegi panjang ke-"+i);
        System.out.print("Masukkan Panjang: ");
        ppArray[i].panjang=sc.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i].lebar=sc.nextInt();
    }    
    for(int i = 0;i<n;i++){
        System.out.println("persegi panjang ke-"+i);
        System.out.println("panjnag: "+ppArray[i].panjang+", lebar: "+ppArray[i].lebar);
    }    
        
  
//        
//        ppArray[0]= new PersegiPanjang();
//        ppArray[0].panjang = 80;
//        ppArray[0].lebar = 40;
//        
//        ppArray[1]= new PersegiPanjang();
//        ppArray[1].panjang = 110;
//        ppArray[1].lebar = 30;
//        
//        ppArray[2]= new PersegiPanjang();
//        ppArray[2].panjang = 100;
//        ppArray[2].lebar = 20;
//        
//        System.out.println("persegi panjang ke-0, panjang: "+ppArray[0].panjang+", lebar: "+ppArray[0].lebar);
//        System.out.println("persegi panjang ke-0, panjang: "+ppArray[1].panjang+", lebar: "+ppArray[1].lebar);
//        System.out.println("persegi panjang ke-0, panjang: "+ppArray[2].panjang+", lebar: "+ppArray[2].lebar);
    }
    
}
