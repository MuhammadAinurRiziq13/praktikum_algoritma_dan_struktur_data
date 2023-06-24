/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("tata", "malang", 200, (byte)3);
        Hotel h2 = new Hotel("titi", "surabaya", 300, (byte)4);
        Hotel h3 = new Hotel("tutu", "gresik", 100, (byte)1);
        Hotel h4 = new Hotel("tete", "lamongan", 150, (byte)2);
        Hotel h5 = new Hotel("toto", "batu", 400, (byte)5);
        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);
        
//        System.out.println("Daftar Data Hotel");
//        list.tampilAll();
        System.out.println("========================TRAVIGO==========================");        
        System.out.println("Macam-Macam sorting: ");
        System.out.println("1. Harga dimulai dari harga termurah ke harga tertinggi. ");
        System.out.println("2. Rating bintang penginapan dari bintang tertinggi ke terendah");
        System.out.print("pilih sorting yang di inginkan [1/2] : ");
        byte sorting = sc.nextByte();
        System.out.println("");
        if(sorting == 1){
            list.bubbleSort();
            System.out.println("Daftar Data Hotel");
            list.tampilAll();
        }else if(sorting == 2){
            list.selectionSort();
            System.out.println("Daftar Data Hotel");
            list.tampilAll();
        }
    }
}
