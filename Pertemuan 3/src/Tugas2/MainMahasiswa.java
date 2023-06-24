/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MainMahasiswa {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.print("Masukkan banyak mahasiswa: ");
        int n = sc.nextInt();
        Mahasiswa [] mahasiswa = new Mahasiswa [n];
        
        for(int i =0;i<n;i++){
            mahasiswa [i]= new Mahasiswa();
            System.out.println("");
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("masukkan nama: ");
            mahasiswa[i].nama = sc.next();
            System.out.print("masukkan nim: ");
            mahasiswa[i].nim = sc.next();
            System.out.print("masukkan jenis kelamin: ");
            mahasiswa[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("masukkan IPK: ");
            mahasiswa[i].ipk = sc.nextDouble();            
        }
        
        for(int i = 0;i<n;i++){
            System.out.println("");
            System.out.println("data mahasiswa ke-"+(i+1));
            System.out.println("Nama: "+mahasiswa[i].nama);
            System.out.println("Nim: "+mahasiswa[i].nim);
            System.out.println("Jenis kelamin: "+mahasiswa[i].jenisKelamin);
            System.out.println("Nilai IPK: "+mahasiswa[i].ipk);
        }
    }  
}
