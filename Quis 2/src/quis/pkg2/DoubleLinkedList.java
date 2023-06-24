/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quis.pkg2;

/**
 *
 * @author LENOVO
 */
public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    //konstruktor untuk menentukan indeks awal
    DoubleLinkedList(){
        head = tail = null;
        size=0;
    }
    
    //method untuk mennetukan apakah linked list kosong atau tidak
    boolean isEmpty(){
        return size==0;
    }
    
    //method untuk melakukan input data dari pertama
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    } 
    
    //method untuk melakukan penghapusan pada indkes pertama
    void deleteFirst(){
        head = head.n;
        head.p = null;
        size--;
    }
    
    //method untuk melakukan print 
    void print(){
        Node tmp = head;
        System.out.print("print : ");
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    
    //method untuk melakukan input data dari terakhir
    void addLast(int data){
        if(isEmpty()){
            addFirst(data);
        }else{
            Node ndInput = new Node(tail, data, null);
            tail.n = ndInput;
            tail = ndInput;
        }
    }
    
    //method untuk melakukan penghapusan pada indkes pertama
    void deleteLast()throws Exception{
        if(isEmpty()){
            throw new Exception ("Linked list kosong, tidak dapat dihapus");
        }else if(head.n == null){
            head = null;
            size--;
            return;
        }else{
            Node current = tail;
            tail = current.p;
            current.p.n = null;
            size--;
        }
    }
    
    //method untuk melakukan print dari indkes terakhir
    void printFromTail(){
        if(isEmpty()){
            System.out.println("Linked list kosong");
        }else{
            Node tmp = tail;
            System.out.print("print from tail: ");
            while(tmp != null){
                System.out.print(""+tmp.data+"-");
                tmp = tmp.p;
            }
            System.out.println("");
        }
    }
    
}

