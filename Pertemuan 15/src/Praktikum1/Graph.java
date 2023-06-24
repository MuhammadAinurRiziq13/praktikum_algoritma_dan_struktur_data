/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author LENOVO
 */
public class Graph {
    int vertex;
    LinkedList list[];
    boolean directed;

    public Graph(int vertex, boolean directed) {
        this.vertex = vertex;
        this.directed = directed;
        list = new LinkedList[vertex];
        for(int i = 0;i < vertex; i++){
            list[i] = new LinkedList();
        }
    }
    
    public void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);
        //add back edge (for undirect)
        if (!directed) {
            // add back edge (for undirected)
            list[destination].addFirst(source);
        }
    }
    
    public void degree(int source)throws Exception{
        if(!directed){
            //degree undirect graph
            System.out.println("degree vertex "+source+" : "+list[source].size());
        }else{
           //degree directed graph inDegree
            int k,totalIn = 0, totalOut = 0;
            for(int i = 0;i < vertex;i++){
                for(int j = 0;j < list[i].size();j++){
                    if(list[i].get(j) == source){
                        ++totalIn;
                    }
                }
                //outDegree
                for(k = 0;k < list[source].size();k++){
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("InDegree dari vertex "+source+" : "+totalIn);
            System.out.println("OutDegree dari vertex "+source+" : "+totalOut);
            System.out.println("Degree vertex "+source+" : "+(totalIn+totalOut)); 
        } 
    }
    public void removeEdge(int source,int destination)throws Exception{
        for(int i = 0;i < vertex;i++){
            if(i == destination){
                list[source].remove(destination);
                if(!directed){
                    list[destination].remove(source);
                }
            }
        }
    } 
    
    public void removeAllEdges(){
        for(int i = 0;i < vertex ; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    
    public void printGraph()throws Exception{
        for(int i = 0; i < vertex;i++){
            if(list[i].size() > 0){
                System.out.print("Vertex "+i+" terhubung dengan: ");
                for(int j = 0;j <list[i].size();j++){
                    System.out.print(list[i].get(j)+" ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public boolean graphType() {
        return directed;
    }
}
 
