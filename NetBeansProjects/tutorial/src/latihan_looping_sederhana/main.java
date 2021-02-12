package latihan_looping_sederhana;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        //program untuk menjumlahkan angka dengan rentang
        
        int nilaiAwal, nilaiAkhir, total;
        
        Scanner inputUser = new Scanner (System.in);
        
        System.out.print("masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukkan niali akhir = ");
        nilaiAkhir = inputUser.nextInt();
        
        
        total = 1;
        
        while (nilaiAwal <= nilaiAkhir) {            
            total = total + nilaiAwal;
            System.out.println(" ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
            
            //total sekarang = total sebelumnya + nilai awal sekarang
            //nilai awa sekarang = nilai awal sekarang + 1
        }
    }
    
}
