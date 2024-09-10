/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18soal2;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan18soal2 {
    public static void main(String[] args) {
        try {
            cekAngka(-5); 
        } catch (IllegalArgumentException e) {
            System.out.println("Exception ditangkap: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah menangkap exception.");
    }
    public static void cekAngka(int angka) {
        if (angka < 0) {
            throw new IllegalArgumentException("Angka tidak boleh negatif: " + angka);
        }
        System.out.println("Angka adalah: " + angka);
    }
}

