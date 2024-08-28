/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13soal2;

/**
 *
 * @author Thinkpad-T450
 */


    class Segitiga {
    
    public double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }
    
    public int hitungLuas(int alas, int tinggi) {
        return (alas * tinggi) / 2;
    }
}

public class Pertemuan13soal2 {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        
        System.out.println("Luas Segitiga dengan alas 10.5 dan tinggi 5.5: " + segitiga.hitungLuas(10.5, 5.5));
        System.out.println("Luas Segitiga dengan alas 10 dan tinggi 5: " + segitiga.hitungLuas(10, 5));
    }
}
