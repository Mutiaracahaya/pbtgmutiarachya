/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10aritmatika3soal2d;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan10aritmatika3soal2d {

    public static void main(String[] args) {
// TODO code application logic here 

// Membuat intance dari kelas aritmatika3
aritmatika3 aritmatikaku=new aritmatika3();

int bilangan1=3;
int bilangan2=3;
aritmatikaku.setPangkat(bilangan1,bilangan2);
System.out.println("Bilangan 1= " + bilangan1);
System.out.println("Bilangan 2= " + bilangan2);
System.out.println("Hasil Pangkat "+ aritmatikaku.getPangkat());
}
}

class aritmatika3 {
    private double hasilPangkat;
    public void setPangkat(int bilangan1, int bilangan2) {
        hasilPangkat = Math.pow(bilangan1, bilangan2); 
    }
    public double getPangkat() {
        return hasilPangkat;
    }
}
