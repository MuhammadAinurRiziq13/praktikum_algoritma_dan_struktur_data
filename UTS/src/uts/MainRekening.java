/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class MainRekening {
    public static void main(String[] args) {
        // instansiasi objek cari rekening
        CariRekening cr = new CariRekening(11);
        // instansiasi objek Rekening
        Rekening R1 = new Rekening("160309273084", "Wallace", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu",
                10000);
        Rekening R2 = new Rekening("161006170573", "darius", "1-357-843-0547", "nec@lectusjusto.org", 7000);
        Rekening R3 = new Rekening("162404012243", "Fuller", "571-7062", "convallis@Vestibulumanteipsum.org", 5000);
        Rekening R4 = new Rekening("162705250112", "Malcolm", "623-0234", "porttitor.tellus.non@Curabitur.ca", 44000);
        Rekening R5 = new Rekening("169712042416", "Geoffrey", "1-683-416-8323",
                "ut.pellentesque@luctusutpellentesque.com", 50000);
        Rekening R6 = new Rekening("161007278862", "Rudyard", "650-5379", "Proin.eget@velitegestaslacinia.ca", 123000);
        Rekening R7 = new Rekening("164603294259", "Troy", "897-7608", "pede.Suspendisse.dui@a.ca", 100000);
        Rekening R8 = new Rekening("163204213437", "Alec", "792-4447", "non@mus.com", 34000);
        Rekening R9 = new Rekening("161807297229", "Walter", "863-8209", "Pellentesque.ut.ipsum@neque.ca", 334544);
        Rekening R10 = new Rekening("169503136823", "Simon", "592-6919", "tellus.justo.sit@commodoauctor.net", 23444);
        Rekening R11 = new Rekening("168507083528", "Kamal", "1-115-339-7678", "dictum@nec.edu", 567770);

        // menambahkan rekening
        cr.tambah(R1);
        cr.tambah(R2);
        cr.tambah(R3);
        cr.tambah(R4);
        cr.tambah(R5);
        cr.tambah(R6);
        cr.tambah(R7);
        cr.tambah(R8);
        cr.tambah(R9);
        cr.tambah(R10);
        cr.tambah(R11);

        // menampilkan data dari rekening
        System.out.println("\nData Rekening sebelum diurutkan");
        cr.tampil();
        System.out.println("========================================================================");

        // menampilkan data rekening setelah diurutkan berdasarkan saldo dalam mode
        // menurun
        System.out.println("\ndata rekening setelah diurutkan berdasarkan saldo dalam mode menurun");
        cr.bubblesort();
        cr.tampil();
        System.out.println("========================================================================");

        // Menampilkan data Rekening yang memiliki saldo < 50000
        System.out.println("\nMenampilkan data Rekening yang memiliki saldo < 50000");
        cr.tampilsedikit();
        System.out.println("========================================================================");

        // Cari data Rekening berdasarkan kata kunci nama
        System.out.println("\ncari data rekeing");
        System.out.print("masukkan nama data yang dicari: ");
        String cari = "Wallace";
        int posisi = cr.cariData(cari);
        cr.tampilData(cari, posisi);
        System.out.println("========================================================================");

        // Tarik dari Rekening untuk sejumlah uang tertentu
        System.out.println("\nmelakukan penarikan uang: ");
        String cariRkng = "darius";
        posisi = cr.cariData(cariRkng);
        int tarik = 5000;
        int hasil = cr.tarik(posisi, tarik);
        System.out.println("saldo darius: " + hasil);
        System.out.println("========================================================================");

        // Setor ke Rekening untuk sejumlah sejumlah uang tertentu
        System.out.println("\nmelakukan stor uang: ");
        String stoRkng = "fuller";
        posisi = cr.cariData(stoRkng);
        int stor = 5000;
        int hasil2 = cr.setor(posisi, stor);
        System.out.println("saldo fuller: " + hasil2);
        System.out.println("========================================================================");
    }
}

