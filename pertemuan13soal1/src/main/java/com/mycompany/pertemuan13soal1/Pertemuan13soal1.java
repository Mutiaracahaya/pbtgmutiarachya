/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13soal1;


/**
 *
 * @author Thinkpad-T450
 */

class CalculatorSederhana {
    
    public int pertambahan(int a, int b) {
        return a + b;
    }
    public int pengurangan(int a, int b) {
        return a - b;
    }
    public int perkalian(int a, int b) {
        return a * b;
    }
    public int pembagian(int a, int b) {
        return a / b;
    }
    }

 public class Pertemuan13soal1 {
    public static void main(String[] args) {

       CalculatorSederhana objek=new CalculatorSederhana();

        int hasilTambah = objek.pertambahan(10, 20); 
        int hasilKurang = objek.pengurangan(10, 20);   
        int hasilKali = objek.perkalian(20, 10);      
        double hasilBagi = objek.pembagian(20, 10);    
       
        System.out.println("Hasil Pertambahan : " + hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
}
