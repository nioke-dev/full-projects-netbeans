
package pengelompokan_aritmatika;

import java.util.Scanner;

public class main {
  public static void main(String[] args){
      //kesimpullannya adalah 
      //perkalian perkalian atau pembagian akan dilakukan terlebih dahulu
      //jika dilakukan perkalian dari kiri ke kanan, maka
      //akan dilakukan operasinya dari kiri ke kanan
      
      int hasil = 5 * 10 / 2;
      System.out.println(hasil);
      hasil = 5 + 2 - 10;
      System.out.println(hasil);
      
      //melakukan pengelompkan operasi dengan ()
      hasil = 60 / (2 + 10);
      System.out.println(hasil);
      
      Scanner userInput = new Scanner (System.in);
      //perhitungan persamaan kuadrat
      System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
      int m,x,c;
      
      System.out.print("nilai x = ");
      x = userInput.nextInt();
      System.out.print("gradient m = ");
      m = userInput.nextInt();
      System.out.print("bias c = ");
      c = userInput.nextInt();
      int y = (m * x * x) + c;
      
      System.out.println("nilai y = " + y);
      
  
  
  }  
}
