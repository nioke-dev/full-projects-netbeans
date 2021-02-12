/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latianedo;

/**
 *
 * @author The Coders
 */
public class NewClass2 {
    public static void main(String[] args) {
        //AND, OR, NOT
        // output yang dihasilkan yaitu true dan false
        
        System.out.println("operator logika AND");
        int a = 10;
        int b = 20;
        boolean c = a > b && b > a; 
        System.out.println("hasil dari logika AND = " + c);
        
        System.out.println("operator logika OR");
        int d = 10;
        int e = 20;
        boolean f = d > e || e > d; 
        System.out.println("hasil dari logika OR = " + f);
        
        System.out.println("operator logika NOT");
        int g = 10;
        int h = 20;
        boolean i = g > h || h > g; 
        System.out.println("hasil dari logika NOT = " + !i);
    }
}
