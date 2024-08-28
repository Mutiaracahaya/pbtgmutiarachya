/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan10aritmatika3;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan10aritmatika3 {
    
public static void main(String[] args) {
// TODO code application logic here 

// Membuat intance dari kelas aritmatika3
aritmatika3 aritmatikaku=new aritmatika3();

int a=15,b=10;
aritmatikaku.setPengurangan(a,b);
System.out.println("Bilangan 1= " + a);
System.out.println("Bilangan 2= " +b);
System.out.println("Hasil Pengurangan "+ aritmatikaku.getKurang());
}
}

class aritmatika3 {
    private int hasil;
    public void setPengurangan(int a, int b) {
        hasil = a - b;
    }
    public int getKurang(){
        return hasil;
    }
}
