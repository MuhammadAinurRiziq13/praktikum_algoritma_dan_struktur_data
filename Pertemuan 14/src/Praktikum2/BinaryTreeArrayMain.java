/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author LENOVO
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();      
//        int[] data = {6, 4, 8, 3, 5, 7, 9};
//        int idxLast = 5;
//        bta.populateData(data, idxLast);
//        bta.traverseInOrder(0);
        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(5);
        bta.add(7);
        bta.add(9);

        bta.traversePreOrder(0);
        System.out.println("");
        bta.traverseInOrder(0);
        System.out.println("");
        bta.traversePostOrder(0);
    }
}
