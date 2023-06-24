/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author LENOVO
 */
public class Stack {
    Node top;
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void push(String input) {
        Node ndInput = new Node(input);
        if (isEmpty()) {
            top = ndInput;
        } else {
            ndInput.next = top;
            top = ndInput;
        }
    }
    public void pop(){ 
        if(isEmpty()){
            System.out.println("stack masih kosong, tidak dapat dihapus");
        }else{
            System.out.println("Data yang keluar: "+top.data);
            top = top.next;
        }
    }
    
    public String peek() {
        if (isEmpty()) {
            return "stack masih kosong";
        } else {
            return top.data;
        }
    }
    
    public void print() {
        Node temp = this.top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

//    public String pop() {
//        if (isEmpty()) {
//            return "stack masih kosong, tidak dapat dihapus";
//        } else {
//            String data = top.data;
//            top = top.next;
//            return data;
//        }
//    }