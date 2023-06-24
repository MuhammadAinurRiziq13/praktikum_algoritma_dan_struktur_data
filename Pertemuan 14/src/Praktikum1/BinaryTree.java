/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author LENOVO
 */
public class BinaryTree {
    Node root;
    int leaf;
    
    public BinaryTree(){
        root = null;
        leaf = 0;
    }
    boolean isEmpty(){
        return root == null;
    }
//    void add (int data){
//        if(isEmpty()){
//            root = new Node(data);
//        }else{
//            Node current  = root;
//            while(true){
//                if(data < current.data){
//                    if(current.left != null){
//                        current = current.left;
//                    }else{
//                        current.left = new Node(data);
//                        break;
//                    }
//                }else if(data > current.data){
//                    if(current.right != null){
//                        current = current.right;
//                    }else{
//                        current.right = new Node(data);
//                        break;
//                    }
//                }else{//data sudah ada
//                    break;
//                }
//            }
//        }
//    }
    
    //add tree secara rekursif
    Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            // data sudah ada
            return current;
        }
        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }
    
    void findMinMax() {
        if (isEmpty()) {
            System.out.println("Tree is Empty");
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        int min = current.data;
        current = root;
        while (current.right != null) {
            current = current.right;
        }
        int max = current.data;
        System.out.println("Nilai paling kecil: " + min);
        System.out.println("Nilai paling besar: " + max);
    }
    
    boolean find (int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
    
    void printLeaf(Node node){
        if(node != null){    
            printLeaf(node.left);
            printLeaf(node.right);
            if(node.right == null && node.left == null){
                System.out.print(" "+node.data);
            }     
        }
    }
    
    int countLeaf(Node node){
        if(node != null){    
            countLeaf(node.left);
            countLeaf(node.right);
            if(node.right == null && node.left == null){
                leaf += 1;
            }     
        }
        return leaf;
    }
    
    void traversePreOrder (Node node){
        if(node != null){
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }
    
    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }

    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is Empty");
            return;
        }
        //cari node (current) yg akan dihapus
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild= false;
            }
        }
        //penghapusan
        if(current == null){
            System.out.println("tidak bisa menemukan data");
            return;
        }else{
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left= current.left;
                }
            }
        }
    }
}

