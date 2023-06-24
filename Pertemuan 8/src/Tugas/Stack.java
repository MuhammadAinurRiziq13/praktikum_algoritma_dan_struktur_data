/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class Stack {
    int size,top;
    Struk data[];

    public Stack(int size) {
        this.size = size;
        data = new Struk[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }

    public void push (Struk struk){
        if(!IsFull()){
            top++;
            data[top] = struk;
        }else{
            System.out.println("Isi stack penuh");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            int x = top;
            top--;
            data[x].tampil();
//            Menggunakan method toString
//            System.out.println("Data yang keluar:\n" + x);
//            System.out.println("Data yang keliuar: "+x.nomorTransaksi+" "+x.tanggalPembelian+" "
//                    +x.jumlahBarang+" "+x.totalHargaBayar);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
//        Menggunakan method toString
//        System.out.println("Elemen teratas:\n" + data[top]);
          data[top].tampil();
    }

    public void print(){
        for(int i = top ;i >= 0;i--){
            data[i].tampil();
//            Menggunakan method toString
//            System.out.println(data[i]);
        }
        System.out.println("");
    }

    public void clear(){
        if(!IsEmpty()){
            Struk x = data[top];
            for(int i = top ;i >= 0;i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void tukarStruk(int jumlahTukar){
        if(!IsEmpty()){
            if(jumlahTukar <= top+1){
                System.out.println("Struk belanja yang akan ditukarkan:");
                for(int i=0; i<jumlahTukar; i++){
                    Struk struk = data[top];
                    System.out.println(struk);
                    top--;
                }
                System.out.println("Struk belanja yang tersisa di stack:");
                print();
            }else{
                System.out.println("Jumlah struk yang akan ditukarkan melebihi jumlah struk yang tersimpan di stack.");
            }
        }else{
            System.out.println("Stack masih kosong");
        }
    }
}