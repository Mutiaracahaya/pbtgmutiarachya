/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal2;

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

public class Pertemuan16soal2 {
    public static void main(String[] args) {
        double A = 9.5;
        double B = 2.5;

        OperasiAritmatika[] operasi = new OperasiAritmatika[4];
        operasi[0] = new Penjumlahan(A, B);
        operasi[1] = new Pengurangan(A, B);
        operasi[2] = new Perkalian(A, B);
        operasi[3] = new Pembagian(A, B);

        for (OperasiAritmatika op : operasi) {
            System.out.println("Hasil: " + op.hitung());
        }
    }
}}
