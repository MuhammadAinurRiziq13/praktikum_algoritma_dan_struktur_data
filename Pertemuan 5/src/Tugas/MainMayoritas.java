/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class MainMayoritas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak suara : ");
        int n = sc.nextInt();
        Mayoritas mayoritas = new Mayoritas(n);
        for (int i = 0; i < mayoritas.suara; i++) {
            System.out.print("Masukkan Nama Ketua : ");
            mayoritas.nama[i] = sc.next();
        }
        String hasil = mayoritas.cariMayoritas(mayoritas.nama, 0, n - 1);
        System.out.println("Mayoritas : " + hasil);
    }  
}

