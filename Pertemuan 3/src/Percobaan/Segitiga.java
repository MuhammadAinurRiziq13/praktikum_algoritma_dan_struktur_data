/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    
    Segitiga(int a,int t){
        alas = a;
        tinggi = t;
    }
    
    double hitungLuas(){
        return 0.5*alas*tinggi;
    }
    
    double hitungKeliling(){
        double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        double keliling = alas+tinggi+miring;
        return keliling;
    }
}