/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author LENOVO
 */
public class Kerucut {
    double jariJari,sisiMiring;
    
//    Kerucut(){
//        
//    }
//    
//    Kerucut(double r,double sm){
//        jariJari = r;
//        sisiMiring = sm;
//    }
//    
    double hitungTinggi(){
        return Math.sqrt(Math.pow(sisiMiring, 2) - Math.pow(jariJari, 2));        
    }
    
    double hitungVolume(){       
        double volume = (1.0/3.0)*Math.PI*(Math.pow(jariJari, 2))*hitungTinggi();
        return volume;
    }
    
    double hitungLuasPermukaan(){   
        double LuasPermukaan = Math.PI*jariJari*(jariJari+hitungTinggi());
        return LuasPermukaan;
    }
}
