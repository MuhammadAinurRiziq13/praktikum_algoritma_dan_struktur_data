/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx;
    
    public PencarianMhs(int jumlahMhs) {
        listMhs = new Mahasiswa[jumlahMhs];
        idx = 0;
    }
    
    void tambah (Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }   
    void tampil(){
//perulangan biasa
//        for(int i = 0;i<listMhs.length;i++){
//            listMhs[i].print();
//            System.out.println("--------------------------------");
//        }
        for(Mahasiswa m: listMhs){
            m.print();
            System.out.println("--------------------------------");
        }
    } 
//   sequential serach dengan nim
//    public int FindSeqSearch(int cari){
//        int posisi = -1;
//        for(int j = 0;j < listMhs.length;j++){
//            if(listMhs[j].nim == cari){
//                posisi = j;
//                
//            }
//        }
//        return posisi;
//    }
     public int FindSeqSearch(String cari){
        int posisi = -1,counter = 0;
        for(int j = 0;j < listMhs.length;j++){
            if(listMhs[j].nama.equalsIgnoreCase(cari)){
                posisi = j;
                counter++;
            }
        }
        return counter;
    }

    public void Tampilpoisisi(String x,int pos){
        if(pos != -1){
            System.out.println("data: "+x+" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data: "+x+" data tidak ditemukan");
        }
    }
    
//    public void TampilData(int x,int pos){
//        if(pos != -1){
//            System.out.println("Nim\t : "+x);
//            System.out.println("Nama\t : "+listMhs[pos].nama);
//            System.out.println("Umur\t : "+listMhs[pos].umur);
//            System.out.println("Ipk\t : "+listMhs[pos].ipk);
//        }else{
//            System.out.println("data "+x+" tidak ditemukan");
//        }
//    }
    
    public void TampilData(String x,int pos){
        if(pos != -1){
            System.out.println("Nim\t : "+listMhs[pos].nim);
            System.out.println("Nama\t : "+x);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("Ipk\t : "+listMhs[pos].ipk);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
    public int FindBinarySearch(int cari, int left,int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }else if(listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    public void mergeSort(){
        int left = 0;
        int right = listMhs.length-1;
        sort(left, right);
    }
    
    private void merge(int left,int middle,int right){
        Mahasiswa[] temp = new Mahasiswa[listMhs.length];
        for(int i = left;i<=right;i++){
            temp[i]= listMhs[i];
        }
        int a = left;
        int b = middle+1;
        int c = left;     
        //membandingkan setiap bilangan
        while(a <= middle && b <= right){
            if(temp[a].nim <= temp[b].nim){
                listMhs[c] = temp[a];
                a++;
            }else{
                listMhs[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle-a;
        for(int i = 0; i <= s;i++){
            listMhs[c+i]= temp[a+i];
        } 
    } 
    
    private void sort (int left,int right){
        if(left < right){
            int middle = (left+right)/2;
            sort(left, middle);
            sort(middle+1, right);
            merge(left, middle, right);
        }
    }

}
