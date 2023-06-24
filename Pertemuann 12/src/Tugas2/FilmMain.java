/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

import java.util.Scanner;
public class FilmMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        LinkedListFilm antrian = new LinkedListFilm();
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("ID film : ");
                    int id = sc.nextInt();
                    System.out.print("Judul Film : ");
                    String judul = sc1.nextLine();
                    System.out.print("Rating Film: ");
                    double rating = sc.nextDouble();
                    Film Q = new Film(id, judul, rating);
                    antrian.addFirst(Q);
                    break;
                case 2:
                    System.out.print("ID film : ");
                    id = sc.nextInt();
                    System.out.print("Judul Film : ");
                    judul = sc1.nextLine();
                    System.out.print("Rating Film: ");
                    rating = sc.nextDouble();
                    Film Q1 = new Film(id, judul, rating);
                    antrian.addLast(Q1);
                    break;
                case 3:
                    System.out.print("ID film : ");
                    id = sc.nextInt();
                    System.out.print("Judul Film : ");
                    judul = sc1.nextLine();
                    System.out.print("Rating Film: ");
                    rating = sc.nextDouble();
                    System.out.print("Masukkan letak indeksnya: ");
                    int idx = sc.nextInt();
                    Film Q2 = new Film(id, judul, rating);
                    antrian.add(Q2, idx);
                    break;
                case 4:
                    antrian.removeFirst();
//                    Film Q3 = antrian.removeFirst();
//                    if (Q3.id != 0 && !"".equals(Q3.judul) && Q3.rating != 0 ) { // pbl2 != null 
//                        System.out.println(Q3.judul+" telah dikeluarkan dari linked list");
//                        antrian.print();
//                    }
                    break;
                case 5:
                    antrian.removeLast();
//                    Film Q4 = antrian.removeLast();
//                    if (Q4.id != 0 && !"".equals(Q4.judul) && Q4.rating != 0 ) { // pbl2 != null 
//                        System.out.println(Q4.judul+" telah dikeluarkan dari linked list");
//                        antrian.print();
//                    }
                    break;
                case 6:
                    System.out.println("masukkan indeks yang ingin dihapus: ");
                    int indeks = sc.nextInt();
                    antrian.remove(indeks);
//                    Film Q5 = antrian.remove(idx);
//                    if (Q4.id != 0 && !"".equals(Q4.judul) && Q4.rating != 0 ) { // pbl2 != null 
//                        System.out.println(Q4.judul+" telah dikeluarkan dari linked list");
//                        antrian.print();
//                    }
                    break;
                case 7:
                    antrian.print();
                    break;
                case 8:
                    System.out.println("masukkan ID film yang dicari: ");
                    int cariId = sc.nextInt();
                    antrian.findSeqSearch(cariId);
                    break;
                case 9:
                    antrian.sorting();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }while(pilih != 10);
    }
    public static void menu(){
        System.out.println("-----------------------------");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("-----------------------------");
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambahkan data akhir");
        System.out.println("3. Tambahkan data index tertentu");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari id film");
        System.out.println("9. Urut data rating film-DESC");
        System.out.println("10.keluar");
        System.out.println("----------------------------");
    }
}
