/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan12soal1;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan12soal1 {
    
    public static void main(String[] args) {
        // Membuat objek KaryawanTetap dengan data contoh
        KaryawanTetap karyawan = new KaryawanTetap("001", "System Analyst", 4000000, 400000, 500000, 1000000);

        // Menampilkan informasi gaji karyawan
       
        
        System.out.println("Gaji System Analyst: " + karyawan.gajiSystemAnalyst);
            System.out.println("Bonus: " + karyawan.bonus);
            System.out.println("Tunjangan Makan: " + karyawan.tunjanganMakan);
            System.out.println("Transport: " + karyawan.transport);
            System.out.println("Gaji Total: " + karyawan.hitungGajiTotal());
    }
}

// Kelas Karyawan sebagai kelas dasar
class Karyawan {
    
    double gajiSystemAnalyst;
    double tunjanganMakan;
    double transport;

    // Konstruktor Kelas Karyawan
    public Karyawan( double gajiSystemAnalyst, double tunjanganMakan, double transport) {
        
        this.gajiSystemAnalyst = gajiSystemAnalyst;
        this.tunjanganMakan = tunjanganMakan;
        this.transport = transport;
    }
}

// Kelas KaryawanTetap yang merupakan subclass dari Karyawan
class KaryawanTetap extends Karyawan {
    double bonus;

    // Konstruktor Kelas KaryawanTetap
    public KaryawanTetap(String id, String jabatan, double gajiSystemAnalyst, double tunjanganMakan, double transport, double bonus) {
        super(gajiSystemAnalyst, tunjanganMakan, transport);
        this.bonus = bonus;
    }

    // Metode untuk menghitung total gaji
    public double hitungGajiTotal() {
        return gajiSystemAnalyst + bonus + tunjanganMakan + transport;
    }
}
