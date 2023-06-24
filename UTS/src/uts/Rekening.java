/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class Rekening {
    String noRekening, nama, telefon, email;
    int saldo;

    Rekening(String nr, String n, String t, String e, int s) {
        noRekening = nr;
        nama = n;
        telefon = t;
        email = e;
        saldo = s;
    }

    public void print() {
        System.out.println("no rekening: " + noRekening);
        System.out.println("nama: " + nama);
        System.out.println("telephon: " + telefon);
        System.out.println("email: " + email);
        System.out.println("saldo: " + saldo);
    }
}
