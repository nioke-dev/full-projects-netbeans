
package operasi_pada_java;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};
        
        //merubah array menjadi strring
        System.out.println("\nmengubah array menjadai string\n==============================");
        printArray(arrayAngka1);
        
        //mengkopi array
        System.out.println("\nmengkopi array\n");
        int[] arrayAngka2 = new int [5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        System.out.println("\nmengkopi dengan loop\n");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
          
                
        //mengkopi dengan copyof
        System.out.println("\nmengkopi dengan copyof\n");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        
        
        //mengkopi dengan copyOfRange
        System.out.println("\nmengkopy dengan copyOfRange\n");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        
        
        //fill array
        System.out.println("\nfill array\n");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 1);
        printArray(arrayAngka5);
        
        
        //komparasi array
        System.out.println("\nkomparasi array\n");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};
        
        System.out.println("\nmembandingkan antara dua buah array\n");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        
        
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini beda");
        }
        
        System.out.println("\nngecek array mana yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        
        System.out.println("\nngecek nama index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));
        
        //sort array
        System.out.println("\nsort array\n===========");
        int [] arrayAngka8 = {6,5,3,3,5,9,5,2};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        
        //search array
        System.out.println("\nsearch array\n=========");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka" + angka + "ada di index " + posisi);
        
        
                
        
    }
    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
        
    }
    
}
