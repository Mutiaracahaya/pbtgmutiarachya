/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan17soal2;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan17soal2 {
    public static void main(String[] args) {
        // Membuat array dua dimensi untuk menyimpan negara dan ibukotanya
        String[][] negaraDanIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Menampilkan ibukota masing-masing negara
        for (int i = 0; i < negaraDanIbukota.length; i++) {
            System.out.println("Ibukota " + negaraDanIbukota[i][0] + " adalah " + negaraDanIbukota[i][1]);
        }
    }
}

