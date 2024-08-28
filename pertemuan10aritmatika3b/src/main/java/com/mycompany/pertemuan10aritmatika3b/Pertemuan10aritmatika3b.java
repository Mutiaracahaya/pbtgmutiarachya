/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10aritmatika3b;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan10aritmatika3b {
    public static void main(String[] args) {
// TODO code application logic here 

// Membuat intance dari kelas aritmatika3
aritmatika3 aritmatikaku=new aritmatika3();

int a=5,b=10;
aritmatikaku.setPerkalian(a,b);
System.out.println("Bilangan 1= " + a);
System.out.println("Bilangan 2= " +b);
System.out.println("Hasil Perkalian "+ aritmatikaku.getKali());
}
}

class aritmatika3 {
    private int hasil;
    public void setPerkalian(int a, int b) {
        hasil = a * b;
    }
    public int getKali(){
        return hasil;
    }
}
