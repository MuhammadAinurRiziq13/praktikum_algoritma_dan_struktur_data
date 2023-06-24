/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");   
        for(String fruit : fruits){
            System.out.printf("%s ",fruit);
        }
        System.out.println("\n "+fruits.toString());
        
        while(!fruits.empty()){
            System.out.printf("%s ",fruits.pop());
        }
        fruits.push("Melon");
        fruits.push("Strawberry");
        fruits.push("Manggo");
        fruits.push("Guava");
        fruits.push("Avocado");
        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ",fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ",e);
        });
        System.out.println("");
        for(int i = 0;i<fruits.size();i++){
            System.out.printf("%s ",fruits.get(i));
        }
        //sorting
        System.out.println("\n------------------------------------");
        Collections.sort(fruits);
        System.out.println("data sesudah di sorting");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
    }
}
