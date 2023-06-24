/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author LENOVO
 */
public class Node {
        Film data;
        Node prev, next;

    public Node(Node prev, Film data,Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
