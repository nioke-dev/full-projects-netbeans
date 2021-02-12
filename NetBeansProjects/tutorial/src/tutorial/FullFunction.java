
package tutorial;

import java.util.Scanner;

public class FullFunction {

    
    /* void : kosong / tidak mengembalikan nilai
    static void ucapin() {
        System.out.println("Hello");
    }
    
    // fungsi dengan parameter
   static void nama(String nama) {
        System.out.println("Nama : " + nama);
    }
    
    // fungsi return
    static int penjumlahan(int x, int y) {
        int hasil = x + y;
        return hasil;
    }
    static String biodata(String nama, String nama_akhir){
        String biodata = nama + nama_akhir;
        return biodata;         
    }*/
    
   /* static double volume_kerucut(int r, int t) {
        double hasil = r*r*t*0.3*3.14;
        return hasil;
    }
    static String absen(String nama){
        
     String absen = nama;
     return absen;
    }*/
    
    
    void biodata(String nama) {
        System.out.println("Nama : " + nama);
    }
    
    
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int angka = ss.nextInt();
        luas_persegi(4);
        FullFunction hah = new FullFunction(); // instansiasi objek
        hah.biodata("ibnu");
        /*System.out.println("Nama : "+absen("samsul"));
        System.out.println("Volume kerucut : " + volume_kerucut(5, 12));
        System.out.println("Volume kerucut : " + volume_kerucut(9, 9));*/
        
        /* ucapin();
      nama("Edo");
      nama("Nurul");
      
        System.out.println("Hasil penjumlahan = " + penjumlahan(2, 2));
        System.out.println("biodata anda : " + biodata("edo", "zocks"));*/
        
       // System.out.println("Hasil : " + volume_kerucut(12, 7));
        
      
    }
    
    public static void luas_persegi(int s) {
        int luas = s * s;
        System.out.println("Hasil : " + luas);        
    }
    
}
