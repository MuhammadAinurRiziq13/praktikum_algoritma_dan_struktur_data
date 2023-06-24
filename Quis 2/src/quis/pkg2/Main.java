/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quis.pkg2;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) throws Exception{
        //pembuatan objek dll2
        DoubleLinkedList dll1 = new DoubleLinkedList();
        //data ditambahkan dari depan 
        dll1.addFirst(45);
        dll1.addFirst(10);
        dll1.addFirst(10);
        dll1.addFirst(15);
        dll1.addFirst(150);
        //data dilakukan print
        dll1.print();
        //data pada indeks terdepan dihapus
        dll1.deleteFirst();
        //data dilakukan print
        dll1.print();
        //data dilakukan print mulai dari belakang
        dll1.printFromTail();
        //data ditambahkan dari belakang 
        dll1.addLast(10);
        //data dilakukan print untuk melihat bahwa data telah ditambahkan pada indeks belakang
        dll1.print();
        //data pada indeks terbelakang dihapus
        dll1.deleteLast();
        //data dilakukan print mulai dari belakang
        dll1.printFromTail();
        dll1.print();
        System.out.println("==================================================");
        
        //pembuatan objek dll2
        DoubleLinkedList dll2 = new DoubleLinkedList();
        //data ditambahkan dari depan 
        dll2.addFirst(45);
        dll2.addFirst(10);
        dll2.addFirst(10);
        dll2.addFirst(15);
        dll2.addFirst(150);
        //data dilakukan print
        dll2.print();
        //data pada indeks terdepan dihapus
        dll2.deleteFirst();
        //data dilakukan print
        dll2.print();
        //data dilakukan print mulai dari belakang
        dll2.printFromTail();
        //data ditambahkan dari belakang 
        dll2.addLast(10);
        //data dilakukan print untuk melihat bahwa data telah ditambahkan pada indeks belakang
        dll2.print();
        //data pada indeks terbelakang dihapus
        dll2.deleteLast();
        //data dilakukan print mulai dari belakang
        dll2.printFromTail();
        dll1.print();
        
        System.out.println("==================================================");
        merge(dll1, dll2);
        //lanjutkan dengan memanggil method merge, split
    }
    
    //method untuk menggabungkan 2 linked list
    public static void merge(DoubleLinkedList dll1,DoubleLinkedList dll2){
        //membuat objek linked list 3
        DoubleLinkedList dll3 = new DoubleLinkedList();
        //menghubungkan linked list 1 dengan linked list 2
        
        dll3.head = dll1.head;
        dll1.tail.n = dll2.head;
        dll3.tail = dll2.tail;
        dll3.print();
    }
    //No. 3 Kode B
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }
}
