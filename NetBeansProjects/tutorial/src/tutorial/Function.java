
package tutorial;

import java.util.Scanner;

public class Function {
    // identifier : public, private, protected
    // tipe : static, none, final
    // return back : void, none
    // nama fungsi : terserah
    // kondisi: (--parameter / nilai--)
    // perintah { // perintah }
    
    // FUNGSI ITU BISA DIGUNAKAN
    
    public static void mobil() {
        System.out.println("Bergerak");
        System.out.println("Rem");
        System.out.println("Ngegas");
        System.out.println("Drift");
    }
    
    public static void sepeda() {
        System.out.println("Ngetril");
        System.out.println("Jatuh");
    }
    
    public static void hitung_jumlah_ayam() {
        int awal_ayam = 10;
        int ayam_tambahan = 2;
        int jumlah_ayam = awal_ayam + ayam_tambahan;
        System.out.println("Jumlah ayam semuanya adalah " + jumlah_ayam);
    }
    
    public static void toko_sandal() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("1. Nike");
        System.out.println("2. Adidas");
        System.out.println("3. Swallo");
        System.out.print("Pilih nomer sandal : ");

        int no_sandal = userInput.nextInt();
        switch (no_sandal) {
            case 1:
                System.out.println("Nike");
                break;
            case 2:
                System.out.println("Adidas");
                break;
            case 3:
                System.out.println("Swallow");
                break;
            default:
                System.out.println("anda nyasar");
                break;
        }
    }
    
    public static void identitas() {
        System.out.println("Nama : Samsul");
        System.out.println("Kelas : X RPL");
    }
    
    public static void hp() {
        System.out.println("Husnul q");
    }
    
    public static void penjumlahan() {
        int x = 2;
        int y = 2;
        int z = x + y;
        System.out.println(z);
    }
    
   
    
    
    public static void main(String[] args) {
        luasSegitiga();
        
    }
    
     public static void luasSegitiga() {
        double luas;
        luas = 1/3*22/7*2*2*4;
        System.out.println(luas);
        
        
    }
}
