/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum1;

import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        char pilih;
        do {
            System.out.print("Jenis: ");
            String jenis = sc.nextLine();
            System.out.print("Warna: ");
            String warna = sc.nextLine();
            System.out.print("Merk: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
//            System.out.print("Apakah anda ingin melakukan 'Push'[y/n] : ");
//            String push = sc.next();
//            if(push.equalsIgnoreCase("y")){
//               stk.push(p); 
//            }
            stk.push(p);
            System.out.print("Apakah anda akan menambahkan data baru: [y/n] ? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        } while (pilih == 'y');

//        System.out.println("\n Macam-macam operasi stack : ");
//        System.out.println("1.print");
//        System.out.println("2.pop");
//        System.out.println("3.peek");
//        System.out.print("Operasi stack mana yang ingin digunakan: ");
//        int stack = sc.nextInt();
//        System.out.println("");
//        if(stack == 1){
//            stk.print();
//        }else if(stack == 2){
//            stk.pop();
//        }else if(stack == 3){
//            stk.peek();
//        }
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
        //tugas1
        stk.getMin();

    }
}
