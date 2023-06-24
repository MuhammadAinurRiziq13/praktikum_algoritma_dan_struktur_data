/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author LENOVO
 */
public class LimasSegiEmpat {
    double sisiAlas,tinggi;
    
//    LimasSegiEmpat(int sa,int t){
//        sisiAlas = sa;
//        tinggi = t;
//    }
    
    double hitungVolume(){
        double volume = (1.0/3.0)*(sisiAlas*sisiAlas)*tinggi;
        return volume;
    }
    
    double hitungLuasPermukaan(){
        double luasPermukaan = (sisiAlas*sisiAlas)+(4* Math.sqrt(Math.pow((sisiAlas/2.0), 2) 
                - Math.pow(tinggi, 2)));
        return luasPermukaan;
    }
     
}
