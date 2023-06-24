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

public class MainStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // inisialisasi objek stack dengan kapasitas 8
        Stack strukBelanja = new Stack(8);
        
        // menambahkan data struk belanja ke dalam stack
        strukBelanja.push(new Struk("001", "01/02/2023", 3, 50000));
        strukBelanja.push(new Struk("002", "03/02/2023", 5, 75000));
        strukBelanja.push(new Struk("003", "05/02/2023", 2, 30000));
        strukBelanja.push(new Struk("004", "08/02/2023", 4, 60000));
        strukBelanja.push(new Struk("005", "10/02/2023", 6, 90000));
        strukBelanja.push(new Struk("006", "12/02/2023", 1, 15000));
        strukBelanja.push(new Struk("007", "15/02/2023", 7, 105000));
        strukBelanja.push(new Struk("008", "17/02/2023", 3, 45000));
        
        // menampilkan informasi struk belanja yang tersimpan di dalam stack
        System.out.println("\nIsi stack:");
        strukBelanja.print();
        
        // meminta input dari user untuk jumlah struk belanja yang akan ditukarkan
        System.out.print("Masukkan jumlah struk belanja yang akan ditukarkan: ");
        int jumlahStrukDitukar = sc.nextInt();
        
        // melakukan pengambilan data struk belanja dari stack sesuai dengan jumlah yang akan ditukarkan
        for (int i = 0; i < jumlahStrukDitukar; i++) {
            if (!strukBelanja.IsEmpty()) {
                strukBelanja.pop();
            } else {
                System.out.println("Tidak bisa melakukan pengambilan, stack kosong!");
                break;
            }
        }
        
        // menampilkan informasi struk belanja yang tersisa di dalam stack
        System.out.println("\nIsi stack tersisa:");
        strukBelanja.print();
    }
}
