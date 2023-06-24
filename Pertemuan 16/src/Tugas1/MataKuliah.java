/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author LENOVO
 */
public class MataKuliah {
    String kodeMk,namaMk;
    int sks;

    public MataKuliah(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }
    
    @Override
    public String toString(){
        return String.format("%s\t%-40s%s", kodeMk, namaMk, sks);
    }
}
