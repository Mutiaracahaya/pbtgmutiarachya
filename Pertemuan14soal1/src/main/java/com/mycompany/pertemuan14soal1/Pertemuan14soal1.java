/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14soal1;

/**
 *
 * @author Thinkpad-T450
 */


    abstract class abstrakhewan {
public abstract void suara();
public void nonsuara2()
{System.out.println(" ini method konkrit dari parent class");
}
}
        class Kucing extends abstrakhewan {
        public void suara() {
        System.out.println("Suara Kucing Meaw");
    }
}
      class Dugong extends abstrakhewan {
        public void suara() {
        System.out.println("non suara");
    }
    }
    public class Pertemuan14soal1 {
    public static void main(String[] args) {
        
        abstrakhewan kucing = new Kucing();
        abstrakhewan dugong = new Dugong();
        kucing.suara();   
        dugong.nonsuara2(); 
    }
}
    
    
    

