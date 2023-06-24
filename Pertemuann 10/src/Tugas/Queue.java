/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Pembeli paling depan di antrian: " + antrian[front].nama 
                    +" || "+ antrian[front].noHP);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.println(antrian[i].nama +" || "+ antrian[i].noHP);
                i = (i+1) % max;
            }
            System.out.println(antrian[i].nama +" || "+ antrian[i].noHP);
            System.out.println("Jumlah elemen = "+size);
        }
    }
    
    public void enqueue(Pembeli dt){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max - 1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            antrian[rear]= dt;
            size++;
        }
    } 
    public Pembeli dequeue(){
        Pembeli dt = new Pembeli();
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            dt = antrian[front];
            size --;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Pembeli paling belakang di antrian: " + antrian[rear].nama+ 
                   " || "+antrian[rear].noHP);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (IsEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
        for (int i = front; i <= rear; i++) {
            if (antrian[i].nama.equals(nama)) {
                System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + (i - front + 1));
                return;
            }
        }
        System.out.println("Pembeli " + nama + " tidak ditemukan di dalam antrian");
    }

    public void daftarPembeli() {
        if (!IsEmpty()) {
            System.out.println("Daftar seluruh pembeli:");
            for (int i = front; i <= rear; i++) {
                System.out.println(antrian[i].nama +" || "+antrian[i].noHP);
            }
        }else{
            System.out.println("Queue kosong");
        }
        
    }
}
