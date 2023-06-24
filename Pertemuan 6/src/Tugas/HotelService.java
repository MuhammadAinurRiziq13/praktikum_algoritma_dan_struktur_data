/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class HotelService {
    Hotel rooms [] = new Hotel[5];
    int idx;
    
    void tambah (Hotel h){
        if(idx<rooms.length){
            rooms[idx++] = h;
        }else{
            System.out.println("Data sudah penuh");
        }
    }   
    void tampilAll(){
        for(Hotel h: rooms){
            h.print();
            System.out.println("--------------------------------");
        }
    }  
    void bubbleSort(){
        for(int i = 0;i<rooms.length-1;i++){
            for(int j = 1;j<rooms.length-i;j++){
                if(rooms[j].harga < rooms[j-1].harga){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }   
     void selectionSort(){
        for(int i = 0 ; i<rooms.length;i++){
            int idxMin = i;
            for(int j = i+1; j<rooms.length; j++){
                if(rooms[j].bintang>rooms[idxMin].bintang){
                    idxMin = j;
                }
            }
            //swap
            Hotel tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }    
}
