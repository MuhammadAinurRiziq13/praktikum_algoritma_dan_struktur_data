/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author LENOVO
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Nilai {
    String kdNilai;
    double nilai;
    Mahasiswa mhs;
    MataKuliah mk;

    public Nilai(String kdNilai, double nilai, Mahasiswa mhs, MataKuliah mk) {
        this.kdNilai = kdNilai;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }
    
    List<Mahasiswa> mhs1 = new ArrayList<>();
    List<MataKuliah> matkul2 = new ArrayList<>();
    
    public void tambahMhs(Mahasiswa... mahasiswa){
        mhs1.addAll(Arrays.asList(mahasiswa));
    }

    public void tambahMatkul(MataKuliah... matkul){
        matkul2.addAll(Arrays.asList(matkul));
    }
    public void tampilMhs(){
        mhs1.stream().forEach(mhs -> {
                System.out.println("" + mhs.toString());
        });
    }
    public void tampilMatkul(){
        matkul2.stream().forEach(mk -> {
                System.out.println("" + mk.toString());
        });
    }
    Mahasiswa cariMhs(String nim){
        for(int i = 0; i < mhs1.size(); i++){
            if(nim.equals(mhs1.get(i).nim)){
                return mhs1.get(i);
            }
        }
        return null;
    }
    MataKuliah cariMatkul(String matkul){
        for(int i = 0; i < matkul2.size(); i++){
            if(matkul.equals(matkul2.get(i).kodeMk)){
                return matkul2.get(i);
            }
        }
        return null;
    }
//    public String toString(int idx1, int idx2){
//        return mhs1.get(idx1).nim + "\t" + mhs1.get(idx1).nama + "\t" 
//                + matkul2.get(idx2).namaMk + "\t" + matkul2.get(idx2).sks + "\t";
//    }
    @Override
    public String toString(){
        return String.format("%s \t %s \t %s \t %d \t %.2f", mhs.nim,mhs.nama, 
                mk.namaMk, mk.sks,nilai);
    }
}


