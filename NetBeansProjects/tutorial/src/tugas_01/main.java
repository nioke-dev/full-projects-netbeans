
package tugas_01;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        /*Scanner input = new Scanner(System.in);
        
        System.out.println("=======DAFTAR HADIR=======");
        System.out.println("1.Ari");
        System.out.println("2.Jeni");
        System.out.println("3.Edo");
        System.out.print("Pilih siswa : ");
        
        int no_absen;
        no_absen = input.nextInt();
        switch (no_absen) {
            case 1:
                System.out.println("Namanya ari");
                break;
            case 2:
                System.out.println("Namanya jeni");
                break;
            case 3:
                System.out.println("Namanya edo");
                break;
            default:
                System.out.println("Nama yang anda ketik tidak ada");
                break;
        }*/
        
        
        
        // Scanner nama_scanner = new Scanner(System.in);
        // assignment
      /*  int angka = 12;
        //declaration
        String ljtylkrjhkljflkjhlkfj;
        ljtylkrjhkljflkjhlkfj = "edo";
        
        Scanner jlkjgdlfjglkdjglkjfdlkgjdlkfjlkhgdlkghj = new Scanner(System.in);
        
        
        int x = 2;
        if(x > 2) {
            System.out.println("haha"); // false
        } else if(x == 2){
            System.out.println("hihi"); // true
        }
        
        switch(x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("tidak ada");
                break;
        }*/
      Scanner input = new Scanner(System.in);
     
        int harga, nama_mobil, total,  jumlah_hari, jumlah_mobil; 
       
        System.out.println("============ DAFTAR RENTAL MOBIL============");
        System.out.println("1. Honda Brio Turbo + modificate");
        System.out.println("2. Honda jazz Turbo + modificate");
        System.out.println("3. Honda civic type R");
        System.out.print("masukkan nomor mobil yang akan di sewa : ");
        
        nama_mobil = input.nextInt();
        switch(nama_mobil){
            case 1:
                System.out.println("Honda Brio Turbo + modificate");
                System.out.print("masukkan jumlah mobil yang akan disewa = ");
                jumlah_mobil = input.nextInt();
                System.out.print("berapa hari anda akan menyewa mobil ini = ");
                jumlah_hari = input.nextInt();
                harga = 10000000;
                total = (jumlah_mobil * harga) * jumlah_hari;
                System.out.println("anda harus membayar Rp." + total);
                break;
            case 2:
                System.out.println("pilihan anda Honda jazz Turbo + modificate");
                System.out.print("masukkan jumlah mobil yang akan disewa = ");
                jumlah_mobil = input.nextInt();
                System.out.print("berapa hari anda akan menyewa mobil ini = ");
                jumlah_hari = input.nextInt();
                harga = 20000000;
                total = (jumlah_mobil * harga) * jumlah_hari;
                System.out.println("anda harus membayar Rp." + total);
                break;
            case 3:
                System.out.println("pilihan anda Honda civic type R");
                System.out.print("masukkan jumlah mobil yang akan disewa = ");
                jumlah_mobil = input.nextInt();
                System.out.print("berapa hari anda akan menyewa mobil ini = ");
                jumlah_hari = input.nextInt();
                harga = 50000000;
                total = (jumlah_mobil * harga) * jumlah_hari;
                System.out.println("anda harus membayar Rp." + total);
                break;
        
        
        
        
        }
        
        
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
        
    }
    
}
