/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4b;

/**
 *
 * @author LENOVO
 */
public class GraphArray <T> {
    private final T[] vertices;
    private final int[][] twoD_array;

    public GraphArray(T[] v) {
        vertices = v;
        twoD_array = new int[vertices.length + 1][vertices.length +1];
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            twoD_array[to][from] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }
    public int getEdge(int to, int from) {
        try{
            return twoD_array[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }
}
