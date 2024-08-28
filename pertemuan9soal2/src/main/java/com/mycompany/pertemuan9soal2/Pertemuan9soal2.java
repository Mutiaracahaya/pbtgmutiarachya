/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9soal2;

import java.util.Scanner;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan9soal2 {

    public static void main(String[] args) {
         Scanner inputnya= new Scanner(System.in); // membuat    a Scanner objec
        System.out.print("Masukan Bilangan Awal?   ");
String Agustav = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Bilangan Awal ? : " + Agustav ); //Output user input
System.out.print("Masukan Bilangan Akhir?   ");
String Nama = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Bilangan Akhir ? : " + Nama ); //Output user input
    int i=3;
 while(i<=15){
 System.out.print(i);
 i+=5;
 System.out.println(); //baris baru
 } 
    }
}
