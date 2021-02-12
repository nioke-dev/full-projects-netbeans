
package tutorial;

public class Function_paramater {
    
//    public void penjumlahan(int x, int y) {
//        int hasil = x + y;
//        System.out.println("Hasil dari " + x + " + " + y + " = " + hasil);
//    }
    
//    public static void luaspersegi (){
//        int x = 12;
//        int y = 15;
//        int z = x * y;
//        System.out.println(z);
    // }
    public static void BIODATA_SISWA (String nama, String kelas, String jurusan, int umur){
        System.out.println("Nama\t: " + nama);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("Jurusan\t: " + jurusan); //note: jika ingin lurus maka tambahkan (/t) didalam string tanpa tanda kurung.
        System.out.println("Umur\t: " + umur);
    }
    
    public static void ucapin(String ucapan) {
        System.out.println(ucapan);
    }
    
    public static int penjumlahan(int x, int y) {
        int z = x + y;
        return z;
    }
    
    public static void main(String[] args) {
        BIODATA_SISWA("nurul", "10", "RPL 2", 16);
        ucapin("Edo bau");
        ucapin("Samsul lemes");
        
        int hasil = penjumlahan(2, 2);
        System.out.println("Hasil = " + hasil);
        
        
        
        //bukan function  parameter tetapi if besarang
       int a = 2;
       int b = 10;
       
        System.out.println("ini adalah awal program");
        
        if (a == 5) {
            if (b == 10) {
                System.out.println("ini adalah benar");
            }else{
                System.out.println("ini adalah salah");
            }
            
            System.out.println("ini adalah akhir program");
            
        }
    }
    
    
}
