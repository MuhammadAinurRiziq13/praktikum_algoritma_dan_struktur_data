/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author LENOVO
 */
public class BinaryTreeArray {
    int [] data;
    int idxLast;
    
    public BinaryTreeArray(){
        data = new int [10];
        idxLast = -1;
    }
    
//    void populateData(int data[],int idxLast){
//        this.data = data;
//        this.idxLast = idxLast;
//    }

    void add(int data) {
        if (idxLast < this.data.length) {
            if (idxLast == -1) {
                this.data[0] = data;
            } else {
                int currentIdx = 0;
                while (true) {
                    if (data < this.data[currentIdx]) {
                        if ((2 * currentIdx) + 1 < idxLast) {
                            currentIdx = (2 * currentIdx) + 1;
                        } else {
                            this.data[(2 * currentIdx) + 1] = data;
                            break;
                        }
                    } else if (data > this.data[currentIdx]) {
                        if ((2 * currentIdx) + 2 < idxLast) {
                            currentIdx = (2 * currentIdx) + 2;
                        } else {
                            this.data[(2 * currentIdx) + 2] = data;
                            break;
                        }
                    } else { // data sudah ada
                        return;
                    }
                }
            }
            idxLast++;
        } else {
            System.out.println("Binary Tree sudah penuh");
        }
    }
        
    void traversePreOrder(int idxStart ){
        if(idxStart <= idxLast ){
            System.out.print(data[idxStart]+" ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }
    
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart]+" ");  
        }
    }
    
}
