/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8soal2;

import java.util.Scanner;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan8soal2 {

    public static void main(String[] args) {
          Scanner inputnya= new Scanner(System.in); // membuat    a Scanner objec
        System.out.print("Nilai Akhir?   ");
String Agustav = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nilai Akhir ? : " + Agustav ); //Output user input
System.out.print("nilai Awal?   ");
String Nama = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nilai Awal ? : " + Nama ); //Output user input  
int arr[]={2015,2014,2013,2012,2011,2010};
 //Printing array using for-each loop
 for(int i:arr){
 System.out.println(i);
 }
    }
}
