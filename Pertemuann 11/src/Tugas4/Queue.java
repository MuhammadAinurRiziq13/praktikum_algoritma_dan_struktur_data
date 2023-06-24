/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author LENOVO
 */
public class Queue {
    Node front, rear;
    
    public boolean isEmpty(){
        return front == null;
    }
    
    public void enqueue(Mahasiswa input) {
        Node newNode = new Node(input);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()){
            System.out.println("Queue masih kosong, tidak dapat dihapus");
        }else if(front == rear){
            front = rear = null;
        }else{
            front = front.next;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            Node tmp = front;
            while (tmp != null) {
                System.out.println("NIM: " + tmp.data.nim);
                System.out.println("Nama: " + tmp.data.nama);
                System.out.println("Umur: " + tmp.data.umur);
                System.out.println("IPK: " + tmp.data.ipk);
                System.out.println("------------------------");
                tmp = tmp.next;
            }
        }
    }
     
}
