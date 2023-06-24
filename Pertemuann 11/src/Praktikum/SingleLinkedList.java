/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

/**
 *
 * @author LENOVO
 */
public class SingleLinkedList {
    Node head;
    Node tail;
    
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Isi linked list:\t ");
            while(tmp != null){
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(int input){//push
        Node ndInput = new Node(input, null);
        if(isEmpty()){ //jika linked list kososng
            head = ndInput;// head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head =  ndInput;
        }
    }
    
    public void addLast(int input){//enqueue
        Node ndInput= new Node(input, null);
        if(isEmpty()){
            head = ndInput;// head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail =  ndInput;
        }
    }
    
    public void insertAfter(int key,int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    
    public void insertBefore(int key,int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                addFirst(input);
                break;
            }else if(temp.next.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    
    public void insertAt(int index,int input){
        if(index < 0){
            System.out.println("indeks salah");
        }else if(index == 0){
            addFirst(input);
        }else{
            Node temp = head;
            for(int i = 0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) tail = temp.next;
        }
    }
    
    public int getData(int index){
        Node tmp = head;
        for(int i = 0;i <index;i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return -1;
        }else{
            return index;
        }
    }
    
    public void removeFirst(){ //pop //dequeue
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }else if(head == tail){
            head = tail = null;
        }else{
            Node temp= head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    } 
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        }else{
            Node temp= head;
            while(temp != null){
                if((temp.data == key)&&(temp == head)){
                    this.removeFirst();
                    break;
                }else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            Node temp= head;
            for(int i = 0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next== null){
                tail = temp;
            } 
        }
    }
    
}
