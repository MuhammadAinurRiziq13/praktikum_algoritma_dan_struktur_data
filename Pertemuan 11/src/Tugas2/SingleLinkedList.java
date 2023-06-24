    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author LENOVO
 */
public class SingleLinkedList {
    Node head;
    
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
    public void addFirst(String input){//push
        Node ndInput = new Node(input, null);
        if(isEmpty()){ 
            head = ndInput;
        }else{
            ndInput.next = head;
            head =  ndInput;
        }
    }
    
    public void addLast(String input){
        Node ndInput= new Node(input, null);
        if(isEmpty()){
            head = ndInput;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ndInput;
        }
        
    }

    public void insertAfter(String key,String input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    
    public void insertBefore(String key,String input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data.equalsIgnoreCase(key)){
                addFirst(input);
                break;
            }else if(temp.next.data.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    
    public void insertAt(int index,String input){
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
        }
    }
}
