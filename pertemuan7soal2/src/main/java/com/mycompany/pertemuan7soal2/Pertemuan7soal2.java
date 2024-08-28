/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7soal2;

import java.util.Scanner;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan7soal2 {

    public static void main(String[] args) {
         Scanner inputnya= new Scanner(System.in); // membuat    a Scanner objec
        System.out.print("Masukan Nim Anda?   ");
String Agustav = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nim ? : " + Agustav ); //Output user input
System.out.print("Masukan Nama Anda?   ");
String Nama = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nama ? : " + Nama ); //Output user input
char peminatan = 'M'; 
int tahun = 3;
 switch( tahun )
 {
 case 1:
 System.out.println("Bahasa Inggris,Matematika, Sain");
 break;
 case 2:
 switch( peminatan )
 {
 case 'C':
 System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data");
 break;
 case 'E':
 System.out.println("Algoritma, Logika Informatika");
 break;
 case 'M':
 System.out.println("DBMS,Manajemen Proyek ");
 break;
 }
 break;
 case 3:
 switch( peminatan )
 {
 case 'C':
 System.out.println("Organisasi Komputer, MultiMedia");
 break;
 case 'E':
 System.out.println("Perancangan Sistem, Pemrograman WEB");
 break; case 'M':
 System.out.println("Pemrograman Mobile, Pemrograman Java 2");
 break;
 }
 break;
 case 4:
 switch( peminatan )
 {
 case 'C':
 System.out.println("Komunikasi Data, MultiMedia");
 break;
 case 'E':
 System.out.println(" Sistem Terdistribusi , Image Processing");
 break;
 case 'M':
 System.out.println("SIM , Sistem Jaringan ");
 break;
 }
 break;
 }
 }
    }

