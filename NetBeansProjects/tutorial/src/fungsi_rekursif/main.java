
package fungsi_rekursif;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukkan nilai = ");
        int nilai = sc.nextInt();
        System.out.println("yang anda masukkan adalah = " + nilai);
        
               
        printnilai(nilai);
        int jumlah = jumlahnilai(nilai);
        System.out.println("jumlah = " + jumlah);
        
        int faktorial = hitungFaktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);
    }
     private static int hitungFaktorial (int parameter){
         System.out.println("parameter = " + parameter);
         if (parameter == 0) {
            return parameter;
        }
        
        return parameter * hitungFaktorial (parameter -1);
    }
    
    
    private static int jumlahnilai (int parameter){
        if (parameter == 0) {
            return parameter;
        }
        
        return parameter + jumlahnilai (parameter -1);
    }
    
    //funsgsi rekursif sederhana
    private static void printnilai (int parameter){
        System.out.println("nilai = " + parameter);
        
        if (parameter == 0) {
            return;
        }
        
        parameter--;
        printnilai(parameter);
                
    }
}
