/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author LENOVO
 */
public class Queue {
    Node front,rear;
    int size;
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public void enqueue(Pengantri item){
        if(isEmpty()){
            front = new Node(null, item, null);
        }else{
            Node current = front;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);   
            current.next = newNode;
        }
        size++;
    }

    public Pengantri dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue masih kosong, tidak dapat dihapus");
        }
        Pengantri tmp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        size--;
        return tmp;
    }
    
    public void print() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue kosong");
        } else {
            Node tmp = front;
            System.out.println("|NO.\t|Nama\t|");
            while (tmp != null) {
                System.out.print(tmp.data.nomor+"\t");
                System.out.println(tmp.data.nama);
                tmp = tmp.next;
            }
            System.out.println("sisa antrian : "+size);
        }
    }
    
    public void cariPengantri(String data) throws Exception{
        if(isEmpty()){
            throw new Exception("Queue kosong");
        }else{
            Node tmp = front;
            boolean found = false;
            while (tmp != null) {
                if (tmp.data.nama.equalsIgnoreCase(data)) {//tmp.data.nomor == data
                    System.out.println("Data pengunjung ditemukan:");
                    System.out.println("----------------------------------------------");
                    System.out.println("Nomor : " + tmp.data.nomor);
                    System.out.println("Nama: " + tmp.data.nama);
                    found = true;
                    break;
                }
                tmp = tmp.next;
            }
            if (!found) {
                System.out.println("Data pengantri dengan nama " + data + " tidak ditemukan");
            }
        }
    }
    //sorting integer
//    public void sorting() {
//        boolean swapped = true;
//        Node current;
//        while (swapped) {
//            swapped = false;
//            current = front;
//            while (current.next != null) {
//                if (current.data.nomor < current.next.data.nomor) {
//                    // Tukar posisi elemen
//                    Pengantri temp = current.data;
//                    current.data = current.next.data;
//                    current.next.data = temp;
//                    swapped = true;
//                }
//                current = current.next;
//            }
//        }
//    }
    //sorting String
    public void sorting() {
        boolean swapped = true;
        Node current;
        while (swapped) {
            swapped = false;
            current = front;
            while (current.next != null) {
                if (current.data.nomor.compareTo(current.next.data.nomor) > 0) {
                    // Tukar posisi elemen
                    Pengantri temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        }
    }

}
