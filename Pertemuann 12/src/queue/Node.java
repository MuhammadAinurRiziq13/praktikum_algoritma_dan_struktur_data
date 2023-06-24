/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author LENOVO
 */
public class Node {
    Pengunjung data;
    Node next,prev;

    public Node(Node prev,Pengunjung data,Node next ) {
        this.prev = prev;
        this.data = data;       
        this.next = next;
    }
}
