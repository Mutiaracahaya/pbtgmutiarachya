/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10aritmatika3soal2c;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan10aritmatika3soal2c {

    public static void main(String[] args) {
// TODO code application logic here 

// Membuat intance dari kelas aritmatika3
aritmatika3 aritmatikaku=new aritmatika3();

int bilangan1=18;
int bilangan2=6;
aritmatikaku.setPembagian(bilangan1,bilangan2);
System.out.println("Bilangan 1= " + bilangan1);
System.out.println("Bilangan 2= " +bilangan2);
System.out.println("Hasil Pembagian "+ aritmatikaku.getBagi());
}
}

class aritmatika3 {
    private int hasil;
    public void setPembagian(int bilangan1, int bilangan2) {
        hasil = bilangan1 / bilangan2;
    }
    public int getBagi(){
        return hasil;
    }
}
