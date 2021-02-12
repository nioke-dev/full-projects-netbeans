
package array_multi_dimensi;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        System.out.println("belajar array multi dimensi");
        
        
        //cara membuat arrapy 2 dimensi dengan asssignment
        int[] [] array_2D = { 
            {1,2,},
            {3,4}     
        };
       
        printarray2D(array_2D);
        
                
        //cara membuat array 2 dimensi dengan deklarasi
        //int[baris], [kolom]
        int[][] arrayAngka = new int [5][4];
        
        printarray2D(arrayAngka);
        
//        //looping lengkap secara manual
//        
//        for (int i = 0; i < arrayAngka.length; i++) {
//            System.out.print("[");
//            
//            for (int j = 0; j < arrayAngka[i].length; j++) {
//                System.out.print(arrayAngka[i][j] + ", ");
//            }
//            System.out.print("]\n");
//        }
//        
//        //looping menggunakan foreach
//        for(int[] baris : arrayAngka){
//            System.out.print("[");
//            for(int angka : baris){
//                System.out.print(angka + ", ");
//            }
//            System.out.print("]\n");
//        }


            //array secara manual, untuk pembuktian
            int[][]  array_2D_2 = {
                    {1,2,3,4,5},
                    {6,7,8,9,10},
                    {11,12,13,14,15},
            };
            printarray2D(array_2D_2);
    }
            
        
   
     private static void printarray2D(int [][] dataArray){
         System.out.print("[\n");
        for(int[] baris : dataArray){
            System.out.print("[");
            for(int angka : baris){
                System.out.print(angka + ", ");
            }
            System.out.print("]\n");
        }
            System.out.print("[\n");
        
         
         
     }
}
