
package tutorial;

import java.util.Scanner; 

public class tugas 
{
    int jumlah, harga;
    String nama_barang;
    public void penjualan() {
        Scanner sc =  new Scanner (System.in);
        
        
        System.out.print("nama barang =\t");
        nama_barang = sc.next();
        System.out.print("harga = 4000 x " );
        jumlah = sc.nextInt();
        harga = 4000 * jumlah;
        System.out.println("bayar =Rp.  " + harga);
        System.out.println("============================");
  
        
        System.out.print("nama barang =\t");
        nama_barang = sc.next();
        System.out.print("harga = 8000 x " );
        jumlah = sc.nextInt();
        harga = 8000 * jumlah;
        System.out.println("bayar =Rp. "+harga );
        System.out.println("============================");
    }
    public static void main(String[] args) {
        tugas tg = new tugas();
        tg.penjualan();
        
    
        
    }
    
}
