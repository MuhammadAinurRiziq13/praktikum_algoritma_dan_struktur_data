/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan3;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    
    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    
    public void tampil(){
        mahasiswas.stream().forEach(mhs ->{
            System.out.println(""+mhs.toString());
        });
    }
    
    int linearSearch(String nim){
        for(int i = 0;i<mahasiswas.size();i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return 1;
            }
        }
        return -1;
    }
    int binarySearch(String nim) {
        List<String> nimList = new ArrayList<>();
        for (Mahasiswa mahasiswa : mahasiswas) {
            nimList.add(mahasiswa.nim);
        }
        return Collections.binarySearch(nimList, nim);
    }
//    int binarySearch(String nim){
//        return Collections.binarySearch(mahasiswas, new Mahasiswa(nim, null, null), 
//                new Comparator<Mahasiswa>(){
//            @Override
//            public int compare(Mahasiswa o1, Mahasiswa o2){
//                return o1.nim.compareTo(o2.nim);
//            }
//        });
//    }

    public void sortAscending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa mhs1, Mahasiswa mhs2) {
                return mhs1.nim.compareTo(mhs2.nim);
            }
        });
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>() {
            @Override
            public int compare(Mahasiswa mhs1, Mahasiswa mhs2) {
                return mhs2.nim.compareTo(mhs1.nim);
            }
        });
    }
    
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234","Noureen","021xx1");
        Mahasiswa m1 = new Mahasiswa("201235","Akhlemaa","021xx2");
        Mahasiswa m2 = new Mahasiswa("201236","Shannum","021xx3");
        //menambhakan objek
        lm.tambah(m,m1,m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.binarySearch("201235"), 
                new Mahasiswa("201235","Akhlema lela","021xx2"));
        System.out.println("");
        lm.tampil();
        System.out.println("\nsetelah sort asc: ");
        lm.sortAscending();
        lm.tampil();
        System.out.println("\nsetelah sort desc: ");
        lm.sortDescending();
        lm.tampil();
    }
    
}
