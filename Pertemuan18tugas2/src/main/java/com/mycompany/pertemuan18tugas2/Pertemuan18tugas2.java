/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18tugas2;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan18tugas2{
    public static void main(String args[]) {
        try {
            float data = 500 / 15;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Blok finally akan selalu dieksekusi");
        }
    }
}
