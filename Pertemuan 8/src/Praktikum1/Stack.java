/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author LENOVO
 */
public class Stack {
    int size,top;
    Pakaian data[];

    public Stack(int size) {
        this.size = size;
        data = new Pakaian [size];
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
    
    public void push (Pakaian pkn){
        if(!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack penuh");
        }
    }
    
    public void pop(){
        if(!IsEmpty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keliuar: "+x.jenis+" "+x.warna+" "
                    +x.merk+" "+x.ukuran+" "+x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: "+data[top].jenis+" "+data[top].warna+" "
                +data[top].merk+" "+data[top].ukuran+" "+data[top].harga);
    }
    
    public void print(){
        System.out.println("Isi stack");
        for(int i = top ;i >= 0;i--){
            System.out.println(data[i].jenis+" "+data[i].warna+" "
                +data[i].merk+" "+data[i].ukuran+" "+data[i].harga+" ");
        }
        System.out.println("");
    }
    
    public void clear(){
        if(!IsEmpty()){
            Pakaian x = data[top];
            for(int i = top ;i >= 0;i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    //tugas1
    public void getMin(){
        if(!IsEmpty()){
            Pakaian minPakaian = data[0];
            for(int i = 1; i <= top; i++){
                if(data[i].harga < minPakaian.harga){
                    minPakaian = data[i];
                }
            }
            System.out.println("Data pakaian dengan harga terendah:");
            System.out.println(minPakaian.jenis+" "+minPakaian.warna+" "
                    +minPakaian.merk+" "+minPakaian.ukuran+" "+minPakaian.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

}
