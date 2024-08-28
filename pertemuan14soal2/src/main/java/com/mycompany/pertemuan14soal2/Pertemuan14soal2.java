/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14soal2;

/**
 *
 * @author Thinkpad-T450
 */

    abstract class AbstrakHewan {
    
    abstract void suara();
}
class Burung extends AbstrakHewan {
    void suara() {
        System.out.println("Suara Burung mencicit");
    }
}
     public class Pertemuan14soal2 {
    public static void main(String[] args) {
        
        Burung burung = new Burung();
        burung.suara();
    }
}

