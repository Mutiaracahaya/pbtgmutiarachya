/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10aritmatikad;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan10aritmatikad {

    public static void main(String[] args) {
// TODO code application logic here 

// Membuat intance dari kelas aritmatika3
aritmatika3 aritmatikaku=new aritmatika3();

int a=2,b=2;
aritmatikaku.setPangkat(a,b);
System.out.println("Bilangan 1= " + a);
System.out.println("Bilangan 2= " + b);
System.out.println("Hasil Pangkat "+ aritmatikaku.getPangkat());
}
}

class aritmatika3 {
    private double hasilPangkat;
    public void setPangkat(int a, int b) {
        hasilPangkat = Math.pow(a, b); 
    }
    public double getPangkat() {
        return hasilPangkat;
    }
}