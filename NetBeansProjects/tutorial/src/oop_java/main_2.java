package oop_java;

public class main_2 {

    public static void penjumlahan(int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
    }
    
    public static void info_nama(String nama) { 
        System.out.println(nama);
    }
    
    // fungsi diskon
    // 
    
    public static void main(String[] args) {
        penjumlahan(2,3); // 5
        penjumlahan(5,2); // 7
        
        info_nama("Edo"); // edo
        info_nama("Nurul"); // nurul
        
    }
    
}
