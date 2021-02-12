
package com.tutorial;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        // variable : nilai yang dapat berubah
        // konstanta : nilai tetap
        
        // tipe_data nama_variable
        
        // tipe data
        // String, int, float, double, char
       /* String nama = "Edmodo";
        int angka = 10;
        float desimal = (float) 0.5;
        double phi = 3.14;*/
        
        // perulangan 
        // for / while / do while
        // for ( tipedata nama_variabel = nilai_awal; kondisi; increment) { //perintah }
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);           
        }*/
        
        // while
        // tipedata nama_variabel = nilai_awal;
        // while( kondisi ) { //perintah; increment }
        /*int i = 1;
        while (i <= 10) {            
            System.out.println(i);
            i++;
        }*/
        
        // do while
        /*int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        */
        // operator aritmatika
       /* int x,y,z;
        x = 5;
        y = 2;
        z = x % y;
        if (z % 2 == 1) {
            System.out.println("Ganjil");
        } else {
            System.out.println("genap");
        }*/
         //switch case
        /* Scanner food = new Scanner (System.in);
        System.out.println("pilihan MENU: ");
        System.out.println("1. ayam goyeng");
        System.out.println("2. ayam gepyek");
        System.out.println("3. es grem");
        System.out.println();
        int mn = food.nextInt();
        System.out.println("silahkan pilih menu:"+mn);

         switch (mn){
                 case 1:
                     System.out.println("harganya 10.000");
                     break;
                 case 2:
                     System.out.println("harganya 15.000");
                     break;
                 case 3:
                     System.out.println("harganya 5000");
                     break;
                 default:
                     System.out.println("maff menu yang anda pilih tidak ada");
            
                     
       
                         }
       
       
       */
        
        
        Scanner s = new Scanner(System.in);
        System.out.print("masukan r : ");
        int r = s.nextInt();
        System.out.print("masukan t : ");
        int t = s.nextInt();
        double volume = r*r*t*3.14;
        System.out.println("Volume  = " + volume);
        
        if (Math.round(volume) % 2 != 1) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
       
       
       
       
    }
    
}
