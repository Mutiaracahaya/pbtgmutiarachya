/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18soal1;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan18soal1 {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; 
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: Pembagian dengan nol tidak diperbolehkan.");
        }
        System.out.println("Program tetap berjalan setelah menangkap exception.");
    }
}
