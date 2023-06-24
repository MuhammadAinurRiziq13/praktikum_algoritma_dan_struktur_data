/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author LENOVO
 */
public class LinkedListFilm {
    Node head;
    int size;

    public LinkedListFilm() {
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Film item){
        if(isEmpty()){ 
            head = new Node(null, item, head);
        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head =  newNode;
        }
        size++;
    }
    public void addLast(Film item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);   
            current.next = newNode;
            size++;
        }
    }
    
    public void add(Film item ,int index)throws Exception{
        if(isEmpty()){
            addFirst(item);
        }else if(index < 0 || index > size ){
            throw new Exception("Nilai Indeks diluar batas");
        }else{
            Node current = head;
            int i = 0;
            while(i<index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, item, current);
                newNode .prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
//    public Film removeFirst()throws Exception{ //pop //dequeue
//        if(isEmpty()){
//            throw new Exception ("Linked list masih kosong, tidak dapat dihapus");
//        }else{
//            Film tmp = head.data;
//            head = head.next;
//            head.prev = null;
//            size--;
//            return tmp;
//        }
//    }
    public void removeFirst()throws Exception{ //pop //dequeue
        if(isEmpty()){
            throw new Exception ("Linked list masih kosong, tidak dapat dihapus");
        }else if(size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception ("Linked list masih kosong, tidak dapat dihapus");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }else{
            Node current= head;
            while(current.next != null){
                current = current.next;
            }
            current.next = null;
            size--;
        }
    } 
//    public Film removeLast() throws Exception {
//        if (isEmpty()) {
//            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
//        } else if (head.next == null) {
//            Film tmp = head.data;
//            head = null;
//            tail = null;
//            size--;
//            return tmp;
//        } else {
//            Node current = head;
//            while (current.next.next != null) {
//                current = current.next;
//            }
//            Film tmp = current.next.data;
//            current.next = null;
//            tail = current;
//            size--;
//            return tmp;
//        }
//    }

    public void remove(int index)throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception ("Nilai indeks diluar batas");
        }else if(index == 0){
            removeFirst();
        }else{
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next= current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }
    
    public void findSeqSearch(int cari) {
        int posisi = -1;
        int indeks = 0;
        Node current = head;
        while (current != null) {
            if (current.data.id == cari) {
                posisi = indeks;
                break;
            }
            current = current.next;
            indeks++;
        }
        if(posisi == -1){
            System.out.println("Data tidak ditemukan");
        }else{
            System.out.println("Data ID film : "+cari+" ditemukan di Node ke-"+posisi);
            System.out.println("Identitas: ");
            System.out.println("ID film: "+current.data.id);
            System.out.println("Judul film: "+current.data.judul);
            System.out.println("Rating film: "+current.data.rating);
        }
    }
//    
    public void sorting() {
        boolean swapped = true;
        Node current;
        while (swapped) {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.data.rating < current.next.data.rating) {
                    // Tukar posisi elemen
                    Film temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        }
    }

    public void print() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue kosong");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("----------------------------------------------");
                System.out.println("ID film: "+tmp.data.id);
                System.out.println("Judul film: "+tmp.data.judul);
                System.out.println("Rating film: "+tmp.data.rating);
                tmp = tmp.next;
            }
        }
    }
}
