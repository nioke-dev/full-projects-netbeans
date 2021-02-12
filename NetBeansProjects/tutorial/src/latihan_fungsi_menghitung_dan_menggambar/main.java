
package latihan_fungsi_menghitung_dan_menggambar;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("panjang =  ");
        int inputpanjang = userInput.nextInt();
        System.out.print("lebar =  ");
        int inputlebar = userInput.nextInt();
        gambar(inputpanjang, inputlebar);
        
        
        
        TampilkanLuasDanKeliling(inputpanjang, inputlebar);
                
                
    }
    private static void TampilkanLuasDanKeliling(int panjang, int lebar){
        System.out.println("luas  = " + luas(panjang, lebar));
        System.out.println("keliling = " + keliling(panjang, lebar));
        
 
}
    
    private static int keliling (int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        System.out.println("menghitung keliling dengan panjang = " + panjang + ", lebar = " + lebar);
        return hasil;
    }
    
    private static int luas (int panjang, int lebar){
        int hasil = panjang * lebar;
         System.out.println("menghitung luas dengan panjang = " + panjang + ", lebar = " + lebar);
        return hasil;
    }
    
    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        
    }
}
