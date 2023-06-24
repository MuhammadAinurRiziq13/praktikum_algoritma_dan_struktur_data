/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quis.pkg2;

/**
 *
 * @author LENOVO
 */
public class Node {
    int data;
    Node n;
    Node p;
    
    Node(){
        data=0;
        n = p = null;
    }
    
    Node(int data){
        this.data = data;
        n = p = null;
    }
    
    Node(Node prev, int data, Node next){
        this.data = data;
        this.n = next;
        this.p = prev;
    }
}
