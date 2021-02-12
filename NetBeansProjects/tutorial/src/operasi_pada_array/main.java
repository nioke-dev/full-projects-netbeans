

package operasi_pada_array;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};
        
        //merubah array menjadi string
        System.out.println("merubah array menjadi string\n================");
        System.out.println(Arrays.toString(arrayAngka1));
        
        //mengkopi array
        System.out.println("\nmengkopi array\n===========");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println("mengkopi dengan loop");
        for(int i= 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        
        //mengkopi dengan copyof
        System.out.println("/nmengkopi dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        //mengkopi dengan copyOfRange
        System.out.println("/nmengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 3, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        
        //fill array
        System.out.println("\nfill array");
        int[] arrayAngka5 = new int[100];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 2);
        printArray(arrayAngka5);
        
        //komparasi array
        System.out.println("\nkomparasi array");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};
        
        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini beda");
        }
        
        System.out.println("\nngecek array mana yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));
        
        System.out.println("\nngecek mana indekx yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));
        
        //sort array
        System.out.println("\nsort array============");
        int[] arrayAngka8 = {1,7,4,7,8,9,0,4,5,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        
        //search array
        System.out.println("\nsearch array===========");
        int angka =  3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka " + angka + " ada di index " + posisi);
        
        
        
        
        
    }
    private static void printArray (int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
