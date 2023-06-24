/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author LENOVO
 */
public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Membuat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("224172012", "Arman Maulana", 20, 3.8);
        Mahasiswa mhs2 = new Mahasiswa("224162717", "Alan Nufal", 21, 3.9);
        Mahasiswa mhs3 = new Mahasiswa("224152628", "Ainur Riziq", 19, 3.7);

        // Menambahkan mahasiswa ke dalam antrian
        queue.enqueue(mhs1);
        queue.enqueue(mhs2);
        queue.enqueue(mhs3);

        // Mencetak isi antrian
        queue.print();
        System.out.println("=============================");

        // Menghapus elemen pertama dari antrian
        queue.dequeue();

        // Mencetak isi antrian setelah penghapusan
        queue.print();
    }
}
