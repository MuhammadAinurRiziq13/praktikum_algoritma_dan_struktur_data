/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class MainGraph {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Apakah graph directed (true/false)? ");
        boolean directed = sc.nextBoolean();
        Graph graph = new Graph(vertices, directed);
        
        System.out.print("Masukkan jumlah edge: ");
        int edges = sc.nextInt();
        System.out.println("Masukkan edge: <source> <destination>");
        for (int i = 0; i < edges; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }
        System.out.println("Graph:");
        graph.printGraph();
        System.out.print("Masukkan vertex untuk mendapatkan derajatnya: ");
        int vertex = sc.nextInt();
        graph.degree(vertex);
        System.out.print("Masukkan edge yang akan dihapus: <source> <destination>: ");
        int SRemove = sc.nextInt();
        int DRemove = sc.nextInt();
        graph.removeEdge(SRemove, DRemove);
        System.out.println("Graph:");
        graph.printGraph();
        
//        Graph graph  = new Graph(6);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2);
//        graph.removeEdge(2, 2);
//        graph.printGraph();
        
    } 
}