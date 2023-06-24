/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author LENOVO
 */
public class Bola {
    double jariJari;
    
//    Bola(int r){
//        jariJari = r;
//    }
    
    double hitungLuasPermukaan(){
        double luasPermukaan = 4*Math.PI*jariJari;
        return luasPermukaan;
    }
    
    double hitungVolume(){
        double volume = (4.0/3.0)*Math.PI*(Math.pow(jariJari, 3));
        return volume;
    }
}
