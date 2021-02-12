package oop_java;

import java.util.Scanner;

public class main_3 {
    
    // biodata
    String nama = "Hani";
    int kelas = 10;
    String jurusan = "TB";
    
    int alas, tinggi, luas;
    
    public void info_siswa(String n, int k, String j) {
        
        // mengubah nilai
        // this.apa
        
        this.nama = n;
        this.kelas = k;
        this.jurusan = j;
        
        
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("=======================");
    }
    public void luas_persegi_panjang(int l, int p){
        System.out.println("luas persegi panjang");
        System.out.println("==========================");
        System.out.println("masukkan lebar = " + l);
        System.out.println("masukkan panjang = " + p);
        int hasil = p * l;
        System.out.println("hasil = " + hasil);
        System.out.println("==========================");
    }
    
            
    public void luas_segitiga(){
        
        Scanner inputuser = new Scanner (System.in);
        System.out.println("\n");
        System.out.println("luas segitiga");
        System.out.println("===========================");
        System.out.print("masukkan alas = ");
        alas = inputuser.nextInt();
        System.out.print("masukkan tinggi = ");
        tinggi = inputuser.nextInt();
        System.out.println("===========================");
        
    }
    public static void main(String[] args) {
        main_3 m = new main_3();

//        m.info_siswa("Hanifah", 12, "RPL");
//        m.info_siswa("Roby", 11, "TB");
//        m.info_siswa("Nurul", 10, "RPL");
        m.luas_persegi_panjang(5, 5);
        m.luas_segitiga();
        
        
    }
    
}
