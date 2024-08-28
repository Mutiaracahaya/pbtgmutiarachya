/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11soal2;
import java.util.Scanner;
/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan11soal2 {

   
   // TODO code application logic here
    public static void main(String[] args) {
        Scanner mahasiswa = new Scanner (System.in);
        System.out.print("Masukan Id Karyawan ? ");
        String nim = mahasiswa.nextLine();
        System.out.println("Id Karyawan ;" + nim);
        
        Scanner Agustav= new Scanner(System.in);
        System.out.print("Masukan Nama Karyawan ? ");
        String orang = Agustav.nextLine();
        System.out.println("Nama Karyawan : " + orang);
        
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
System.out.println("Id Karyawan:"+ IdKaryawan);
System.out.println(" Nama:"+ NamaKaryawan ); 
System.out.println("Gol:"+ GolKaryawan);  
System.out.println("Jabatan:"+ JabatanKaryawan);  
System.out.println("GajiPokok:"+ GajiKaryawan);
int gaji = 3;
switch (gaji) {
    case 1:
        System.out.println("gaji = 300.000");
    break;
    case 2:
        System.out.println("gaji = 4.000.000");
    break;
    case 3:
        System.out.println("gaji = 4.000.000");
}
    }

}

