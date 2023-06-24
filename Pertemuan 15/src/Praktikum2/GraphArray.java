/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author LENOVO
 */
public class GraphArray {
    private final int vertices;
    private final int [][] twoD_array;

    public GraphArray(int v) {
        vertices = v;
        twoD_array = new int [vertices+1][vertices+1];
    }
    
    public void makeEdge(int to,int from,int edge){
        try{
            twoD_array[to][from]= edge;
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("vertex tidak ada");
        }
    }
    
    public int getEdge(int to,int from){
        try{
            return twoD_array[to][from];
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("vertex tidak ada");
        }
        return -1;
    }
}
