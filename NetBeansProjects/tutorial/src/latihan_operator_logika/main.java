package latihan_operator_logika;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    //membuat sebuah objek untuk menangkap sebuah input dari user
        Scanner inputUser = new Scanner (System.in);
        int nilaiBenar = 6;
        int  nilaiTebakan;
        boolean statusTebakan;
        
        System.out.println("masukkan nilai tebakan anda: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah = " + nilaiTebakan);
        
        //operati logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda = " + statusTebakan); 
        
        //operasi aljabar boolean (and / OR)
        System.out.print("masukkan nilai diantara 4 dan 9 : ");
        nilaiTebakan = inputUser.nextInt();
        
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan <9);
        
        /*
        a | b | c 
        0   0   0
        0   1   0
        1   0   0
        1   1   1
       */
        System.out.println("tebakan anda :" + statusTebakan);
            
    
    
    
    
    
    
    
    
    
    }
    
}
