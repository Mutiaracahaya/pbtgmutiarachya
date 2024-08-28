/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11soal1;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan11soal1 {

    public static void main(String[] args) {
   // TODO code application logic here
Karyawan objek1=new Karyawan(1111 , "Agus " , "3  " ,"Manager ", "4.000.000");
objek1.info();
    }
}

class Karyawan {
int IdKaryawan;
String NamaKaryawan;
String GolKaryawan;
String JabatanKaryawan;
String GajiKaryawan;
// constructor dengan 2 parameter
Karyawan (int id, String nama, String gol, String jabatan, String gajipokok){
this.IdKaryawan = id;
this.NamaKaryawan = nama;
this.GolKaryawan = gol;
this.JabatanKaryawan = jabatan;
this.GajiKaryawan = gajipokok;
}
void info(){
System.out.println("Id Karyawan:"+ IdKaryawan  +  " Nama:"+ NamaKaryawan  +  "Gol:"+ GolKaryawan  +  "Jabatan:"+ JabatanKaryawan  +  "GajiPokok:"+ GajiKaryawan);
}
}