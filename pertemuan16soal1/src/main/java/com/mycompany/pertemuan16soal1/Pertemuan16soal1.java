 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal1;;

/**
 *
 * @author Thinkpad-T450
 */

abstract class OperasiAritmatika {
    
    protected double A;
    protected double B;

    public OperasiAritmatika(double A, double B) {
        this.A = A;
        this.B = B;
    }
    
    protected abstract double hitung();
}

class Penjumlahan extends OperasiAritmatika {
    public Penjumlahan(double A, double B) {
        super(A, B);
    }

    protected double hitung() {
        return A + B;
    }
}

class Pengurangan extends OperasiAritmatika {
    public Pengurangan(double A, double B) {
        super(A, B);
    }

    protected double hitung() {
        return A - B;
    }
}

class Perkalian extends OperasiAritmatika {
    public Perkalian(double A, double B) {
        super(A, B);
    }

    protected double hitung() {
        return A * B;
    }
}

class Pembagian extends OperasiAritmatika {
    public Pembagian(double A, double B) {
        super(A, B); 
    }

    protected double hitung() {
        if (B != 0) {
            return A / B;
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
            return Double.NaN; 
        }
    }
}

public class Pertemuan16soal1 {
    public static void main(String[] args) {
        double A = 9.5;
        double B = 2.5;

        Penjumlahan penjumlahan = new Penjumlahan(A, B);
        Pengurangan pengurangan = new Pengurangan(A, B);
        Perkalian perkalian = new Perkalian(A, B);
        Pembagian pembagian = new Pembagian(A, B);

        System.out.println("Hasil Penjumlahan: " + penjumlahan.hitung());
        System.out.println("Hasil Pengurangan: " + pengurangan.hitung());
        System.out.println("Hasil Perkalian: " + perkalian.hitung());
        System.out.println("Hasil Pembagian: " + pembagian.hitung());
    }
}
