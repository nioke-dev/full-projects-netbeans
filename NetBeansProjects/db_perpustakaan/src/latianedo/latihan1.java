package latianedo;

import java.util.Scanner;

public class latihan1 {
    
    public static void main(String[] args) {   
        
        Scanner inputUser = new Scanner (System.in);
        
        System.out.print("panjang = ");
        int panjang = inputUser.nextInt();
        System.out.print("lebar = ");
        int lebar = inputUser.nextInt();
        
        
        int luas = panjang * lebar;
        System.out.println("luas = " + luas);
        
        //membuat perhitungan luas persegi panjang
        //luas = panjang * lebar
        
//        int panjang = 10;
//        int lebar = 5;
//        int luas = 10 * 5;
//        System.out.println("luas = " + luas);
        
    }
}
