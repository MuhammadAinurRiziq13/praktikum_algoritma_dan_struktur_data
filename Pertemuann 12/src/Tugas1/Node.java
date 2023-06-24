/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author LENOVO
 */
public class Node {
    Pengantri data;
    Node prev, next;

    public Node(Node prev, Pengantri data,Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
