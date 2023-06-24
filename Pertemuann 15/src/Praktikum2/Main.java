/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int v ,e, count = 1,to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray graph;
        try{
            System.out.print("Masukkan jumlah vertices: ");
            v = sc.nextInt();
            System.out.print("Masukkan jumlah edge: ");
            e = sc.nextInt();
            
            graph = new GraphArray(v);
            
            System.out.println("Masukkan edge: <to> <from>");
            while(count <= e){
                to = sc.nextInt();
                from = sc.nextInt();
                
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2d sebagai representasi graph abb: ");
            System.out.print("  ");
            for(int i = 1;i <= v;i++){
                System.out.print(i+" ");
            }
            System.out.println("");
            
            for(int i = 1 ;i <= v;i++){
                System.out.print(i+" ");
                for(int j = 1;j <= v;j++){
                    System.out.print(graph.getEdge(i, j)+" ");
                }
                System.out.println("");
            }
        }catch(Exception E){
            System.out.println("Error. Silahkan cek kembali\n"+E.getMessage());
        }
        sc.close();
    }
}
