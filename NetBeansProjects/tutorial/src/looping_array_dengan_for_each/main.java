
package looping_array_dengan_for_each;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int arrayAngka[] = {11,12,13,14,15,16,17,18,19,20};
        
        System.out.println(Arrays.toString(arrayAngka));
        
        
        System.out.println("\n");
        //looping standart
        System.out.println("looping dengan prorperti standart");
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("index ke -" + i + " adalah" + arrayAngka[i]);
        }
        System.out.println("\n"); 
       
        //looping dengan properti array
        System.out.println("loopiing dengan properti length");
        System.out.println("\n");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("index ke-" + i + " adalah" + arrayAngka[i]);
        }
        //looping khususon untuk collection <- array
        System.out.println("looping for each");
        for (int angka : arrayAngka){
            System.out.println("angka pada looping ini = " + angka);
        }
        
      
    }
    
}
