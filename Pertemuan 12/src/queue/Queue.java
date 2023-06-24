/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author LENOVO
 */
public class Queue {
    Node front,rear;
    int size;
    
    Film f1 = new Film(1, "Jurassic Park", 8.5, 40000);
    Film f2 = new Film(2, "Spiderman", 7.0, 50000);
    Film f3 = new Film(3, "Kingdom", 9.0, 30000);
    Film f4 = new Film(4, "Vagabond", 8.0, 35000);
    Film f5 = new Film(5, "Tenki no Ko", 9.5, 40000);
        
    public boolean isEmpty(){
        return front == null;
    }
    
    public void enqueue(Pengunjung data){
        Node ndInput = new Node(null, data, null);
        if(isEmpty()){
            front = ndInput;
            rear = ndInput;
        }else{
            rear.next = ndInput;
            rear = ndInput;
        }
        size++;
    }
    
    public Pengunjung dequeue()throws Exception{
        if(isEmpty()){
            throw new Exception("queue masih kosong");
        }
        Pengunjung tmp = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }else{
            front.prev = null;
        }
        size--;
        return tmp; 
    }
    
    public void print() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue kosong");
        } else {
            Node tmp = front;
            while (tmp != null) {
                System.out.println("----------------------------------------------");
                System.out.println("Nama Pengunjung: " + tmp.data.namaPengunjung);
                System.out.println("Judul Film: " + tmp.data.Film);
                System.out.println("Jumlah Tiket: " + tmp.data.jmlTiket);
                System.out.println("Detail Film:");
                printFilmDetails(tmp.data.Film);
                double totalHarga = tmp.data.jmlTiket * getHargaTiket(tmp.data.Film);
                System.out.println("Total Harga: " + totalHarga);
                tmp = tmp.next;
            }
        }
    }

    public double getHargaTiket(String judul) {
        Film[] films = { f1, f2, f3, f4, f5 };
        for (Film film : films) {
            if (film.judul.equalsIgnoreCase(judul)) {
                return film.hargaTiket;
            }
        }
        return 0;
    }

    public void printFilmDetails(String judul) {
        Film[] films = {f1, f2, f3, f4, f5};
        for (Film film : films) {
            if (film.judul.equalsIgnoreCase(judul)) {
                System.out.println("ID film: " + film.id);
                System.out.println("Rating film: " + film.rating);
                System.out.println("Harga Tiket: " + film.hargaTiket);
                break;
            }
        }
    }
    
    public void cariPengunjung(String namaPengunjung) throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue kosong");
        } else {
            Node tmp = front;
            boolean found = false;
            while (tmp != null) {
                if (tmp.data.namaPengunjung.equalsIgnoreCase(namaPengunjung)) {
                    System.out.println("Data pengunjung ditemukan:");
                    System.out.println("----------------------------------------------");
                    System.out.println("Nama Pengunjung: " + tmp.data.namaPengunjung);
                    System.out.println("Judul Film: " + tmp.data.Film);
                    System.out.println("Jumlah Tiket: " + tmp.data.jmlTiket);
                    System.out.println("Detail Film:");
                    printFilmDetails(tmp.data.Film);
                    double totalHarga = tmp.data.jmlTiket * getHargaTiket(tmp.data.Film);
                    System.out.println("Total Harga: " + totalHarga);
                    found = true;
                    break;
                }
                tmp = tmp.next;
            }
            if (!found) {
                System.out.println("Data pengunjung dengan nama " + namaPengunjung + " tidak ditemukan");
            }
        }
    }

}
