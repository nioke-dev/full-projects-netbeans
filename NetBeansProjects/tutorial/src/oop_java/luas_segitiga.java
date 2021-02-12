/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_java;

import java.util.Scanner;

public class luas_segitiga {

    
    int alas, tinggi;
    double luas;
    
    public void luas() {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Alas : ");
        this.alas = s.nextInt();
        System.out.print("Tinggi : ");
        this.tinggi = s.nextInt();
        
        luas = alas * tinggi / 2;
        System.out.println("Luas = " + luas);
        
    }
    
    public static void main(String[] args) {
        luas_segitiga l = new luas_segitiga();
        l.luas();
    }
    
}
