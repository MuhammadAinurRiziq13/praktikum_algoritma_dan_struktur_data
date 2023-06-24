/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;
import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stok[][] = new int[4][4];
        int stokRusak[][] = new int[4][4];
        int stokTiapBunga[] = new int[4];
        int totalPendapatan[] = new int[4];
        String bunga[] = { "aglonema", "keladi", "alocasia", "mawar" };
        for (int i = 0; i < stok.length; i++) {
            System.out.println("masukkan stok masuk di royal garden " + (i + 1) + " : ");
            for (int j = 0; j < stok[0].length; j++) {
                if (j == 0) {
                    System.out.print("stok aglonema: ");
                    stok[i][j] = sc.nextInt();
                    stokTiapBunga[0] += stok[i][j];
                } else if (j == 1) {
                    System.out.print("stok keladi: ");
                    stok[i][j] = sc.nextInt();
                    stokTiapBunga[1] += stok[i][j];
                } else if (j == 2) {
                    System.out.print("stok alocasia: ");
                    stok[i][j] = sc.nextInt();
                    stokTiapBunga[2] += stok[i][j];
                } else if (j == 3) {
                    System.out.print("stok mawar: ");
                    stok[i][j] = sc.nextInt();
                    stokTiapBunga[3] += stok[i][j];
                }
            }
        }
        tabel(stok);
        jumlahStok(stokTiapBunga, bunga);

    }

    static void tabel(int stok[][]) {
        System.out.println("\t\t Aglonema\tkeladi\t\talocasia\tmawar");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < stok.length; i++) {
            System.out.print("Royal Garden " + (i + 1) + " : ");
            for (int j = 0; j < stok[0].length; j++) {
                System.out.print(stok[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    static void jumlahStok(int stokTiapBunga[], String bunga[]) {
        System.out.println();
        System.out.println("stok jenis bunga di seluruh cabang: ");
        for (int i = 0; i < stokTiapBunga.length; i++) {
            System.out.println(bunga[i] + " : " + stokTiapBunga[i]);
        }
        System.out.println();
    }
}
