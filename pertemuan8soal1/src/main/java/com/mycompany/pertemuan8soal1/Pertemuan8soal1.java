/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8soal1;

import java.util.Scanner;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan8soal1 {

    public static void main(String[] args) {
      Scanner inputnya= new Scanner(System.in); // membuat    a Scanner objec
        System.out.print("Nilai Awal?   ");
String Agustav = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nilai Awal ? : " + Agustav ); //Output user input
System.out.print("nilai Akhir?   ");
String Nama = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nilai Akhir ? : " + Nama ); //Output user input  
int arr[]={5,10,15,20,25,30,35,40,45,50};
 //Printing array using for-each loop
 for(int i:arr){
 System.out.println(i);
 }
 }

    }
 
